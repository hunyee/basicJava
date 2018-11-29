package G_Exception;

public class ExceptionEx05 {
	public static void main(String[] args) {
		try {
			copyFile();
			startInstall();
		} catch (Exception e) {
			
		} finally {
			deleteFile();
		}
		
	}
	
	static void copyFile() {
		System.out.println("파일복사");
	}
	
	static void startInstall() {
		System.out.println("인스톨~");
	}
	
	static void deleteFile() {
		System.out.println("파일삭제");
	}
}
