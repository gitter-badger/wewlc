package changingsamecodeallover.before;

import java.io.OutputStream;

public class LoginCommand {
	String userName;
	String passwd;
	
	private static final byte[] header = {(byte)0xde, (byte)0xad};
	private static final byte[] commandChar = {(byte)0xde};
	private static final byte[] footer = {(byte)0xbe, (byte)0xef};
	private static final int SIZE_LENGTH = 1;
	private static final int CMD_BYTE_LENGTH = 1;
	
	private int getSize() {
		return header.length +
				SIZE_LENGTH +
				CMD_BYTE_LENGTH +
				footer.length +
				userName.getBytes().length + 1 + 
				passwd.getBytes().length + 1;
	}

	public LoginCommand(String userName, String passwd) {
		this.userName = userName;
		this.passwd = passwd;
	}
	
	public void write(OutputStream outputStream) throws Exception {
		outputStream.write(header);
		outputStream.write(getSize());
		outputStream.write(commandChar);
		outputStream.write(userName.getBytes());
		outputStream.write(0x00);
		outputStream.write(passwd.getBytes());
		outputStream.write(0x00);
		outputStream.write(footer);
	}
}