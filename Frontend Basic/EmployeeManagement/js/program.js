// $(document).ready(function(){


$(function () {
    $(".header").load("header.html");
    $(".main").load("home.html");
    $(".footer").load("footer.html");
});

function clickNavHome() {
    $(".main").load("home.html");
}

function clickNavView() {
    $(".main").load("viewlistemployees.html");
    buildTable();
}

var employees = [];

function Employee(id, name, department, phone) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.phone = phone;
}

function getListEmployees() {
    //call API from server
    $.get("https://5fbfb63cfd14be0016748f89.mockapi.io/v1/employees", function (data, status) {
        //reset list employees
        employees = [];
        //error
        if (status == "error") {
            alert("Error when loading data");
            return;
        }
        //succcess
        parseData(data);
        fillEmployeeToTable();
    });
}

function parseData(data) {
    //employee = data
    data.forEach(function (item) {
        employees.push(new Employee(item.id, item.name, item.department_name, item.phone));
    });
}

function fillEmployeeToTable() {
    employees.forEach(function (item) {
        $("#table-emp").append(
            '<tr>' +
            '<td>' + item.id + '</td>' +
            '<td>' + item.name + '</td>' +
            '<td>' + item.department + '</td>' +
            '<td>' + item.phone + '</td>' +
            '<td>' + '<a onclick="openEditModal(' + item.id + ')" class=edit title=Edit data-toggle=tooltip><i class=material-icons>&#xE254;</i></a> <a onclick="openDeleteModal(' + item.id + ')" class=delete title=Delete data-toggle=tooltip><i class=material-icons>&#xE872;</i></a>' + '</td>' +
            '</tr>'
        )
    });
}


function buildTable() {
    $("#table-emp").empty();
    getListEmployees();
}

function openAddModal() {
    // resetForm();
    $('#modalAddNew').modal('show');

}
// function resetForm(){
//     $('#fid').val("");
//     $('#fname').val("");
//     $('#fdpmt').val("");
//     $('#fphone').val("");
// }


function hideModal(selector) {
    $(`#${selector}`).modal('hide');
}

// function openEditModal(id){
//     showModal('modalEdit');
// }

function openDeleteModal(id) {
    $('#modalDelete').modal('show');
    var index = employees.findIndex(x => x.id == id);
    var username = employees[index].name;
    $("#d-user").text(username);
    $('#cf-delete').val(id);
    // $("#cf-delete").click(deleteEmployee(id));
}


function addEmployee() {

    var name = $("#fname").val();
    var department = $("#fdpmt").val();
    var phone = $("#fphone").val();
    if (name == '' || (department == '' || phone == '')) {
        alert("Please enter required information");
    } else {
        var employee = {
            name: name,
            department_name: department,
            phone: phone
        };
        $.post("https://5fbfb63cfd14be0016748f89.mockapi.io/v1/employees", employee,
            function (data, status) {
                if (status == "error") {
                    alert("Error when loading data");
                    return;
                }
                hideModal('modalAddNew');
                showSuccessAlert();
                buildTable();
            });

    }

}



function deleteEmployee() {
    var id = $('#cf-delete').val();
    $.ajax({
        url: 'https://5fbfb63cfd14be0016748f89.mockapi.io/employees/' + id,
        type: 'DELETE',
        success: function (result) {

            // error
            if (result == undefined || result == null) {
                alert("Error when loading data");
                return;
            }

            // success
            hideModal('modalDelete');
            showSuccessAlert();
            buildTable();
        }
    });
}

function openEditModal(id) {

    var index = employees.findIndex(x => x.id == id);

    $('#fu-id').val(employees[index].id);
    $('#fu-name').val(employees[index].name);
    $('#fu-dpmt').val(employees[index].department);
    $('#fu-phone').val(employees[index].phone);
    $('#modalEdit').modal('show');

}

function updateEmployee() {
    var id = $("#fu-id").val();
    var name = $("#fu-name").val();
    var department = $("#fu-dpmt").val();
    var phone = $("#fu-phone").val();

    var employee = {
        name: name,
        department_name: department,
        phone: phone
    };

    $.ajax({
        url: 'https://5fbfb63cfd14be0016748f89.mockapi.io/employees/' + id,
        type: 'PUT',
        data: employee,
        success: function (result) {
           
            //error
            if (result == undefined || result == null) {
                alert("Error when loading data!");
                return;
            }
            //success

            hideModal('modalEdit');
            showSuccessAlert();
            buildTable();
        }

    });

}

function showSuccessAlert() {
    $("#success-alert").fadeTo(2000, 300).slideUp(300, function () {
        $("#success-alert").slideUp(300);
    });
}



// });