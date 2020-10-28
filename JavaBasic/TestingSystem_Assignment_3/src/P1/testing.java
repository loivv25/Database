package P1;

import javax.net.ssl.HandshakeCompletedEvent;

public class testing {

	public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
     buffer.append('b');
        System.out.println(buffer.capacity());
        System.out.println(buffer.charAt(3));
        System.out.println(buffer.hashCode());
        Question q = new Question();
System.out.println(q.createDate);
}
}