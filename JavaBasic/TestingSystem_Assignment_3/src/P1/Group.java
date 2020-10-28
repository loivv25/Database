package P1;
import java.util.Arrays;
import java.util.Date;
public class Group {
	int groupId;
	String groupName;
	int creatorId;
	Date createDate;
	Account[] accountOfGroup;
	@Override
	public String toString() {
		return groupName;
	}
	
}
