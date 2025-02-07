package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test5 {
	public static void main(String[] args) {
		//nil 클래스는 io 클래스의 성능이 업그레이드된 클래스이다. 
		//디렉토리 = 폴더 같은 의미 
		
		String projectDir = System.getProperty("user.dir"); // 현재 디렉토리의 위치 
		// System.getProperty메소드의 ("user.dir"); 를 아규먼트로 입력 시 현재 디렉토리의 위치를 return 할수 있다. (운영체제 상관없이)
	
		String packagePath = "src/test"; 
		String fileName = "benson.txt"; 
		
		Path p1 = Paths.get(projectDir).resolve(packagePath).resolve(fileName); 
		// Path 인터페이스는 경로를 저장할 수 있다. 
		// Paths 클래스는 Path와 관련한 다양한 메서드(경로추가, 수정, 살정등)을 제공한다. (보통 클래스나 인터페이스 뒤에 s가 붙으면 해당 클래스나 인터페이스의 도움 주는 클래스)
		// Paths의 get, resolve 메서드를 활용해 경로들을 합치고 있다. 
		/// get메소드와 resolve 메서드는 어떻게 실행(역할)되는지 
		
		System.out.println(String.format("%-20s",  "user.dir: ") + projectDir); 
		System.out.println(String.format("%-20s",  "toAbsolutePath: ") + p1.toAbsolutePath()); 
		// toAbsolutePath메서드는 p1에 대한 절대경로(처음부터 끝까지)를 return 한다. 
		System.out.println(String.format("%-20s",  "getFileName: ") + p1.getFileName()); 
		// getFileName메서드는 파일 일므만 출력 
		System.out.println(String.format("%-20s",  "getName(0): ") + p1.getName(0)); 
		// getName 메서드는 경로에서 (아규먼트) 번에 위치하고 있는 폴더의 이름을 return 한다. 
		// 0번이 왜 C:\ 폴더가 아닌 user폴더지? 
		System.out.println(String.format("%-20s", "getName(1): ") + p1.getName(1)); 
		System.out.println(String.format("%-20s",  "getNameCount: ") + p1.getNameCount()); 
		// getNameCount메서드는 전체 폴더를 알 수 있다. 
		System.out.println(String.format("%-20s", "getName(n): ") + p1.getName(p1.getNameCount()-1)); 
		// 전체폴더 수 -1을 할 경우 제일 마지막에 위치한 폴더 이름을 return 한다 (0번부터 인덱스가 시작하기 떼문)
		System.out.println(String.format("%-20s", "subPath: ") + p1.subpath(p1.getNameCount()-6, p1.getNameCount()-2)); 
		// subpath 메서드는 첫번째 아규먼트 부터 두번째 아규먼트 사이 경로의 폴더 이름을 return 
		System.out.println(String.format("%-20s",  "getParent: ") + p1.getParent()); 
		// getParent 메서드는 해당 파일이 위치고 있는 폴더까지 위치를 return 한다. (부모폴더) 
		System.out.println(String.format("%-20s", "getRoot: ") + p1.getRoot()); 
		// getRoot는 절대경로에서 최상위 폴더를 return 한다. 
		System.out.println(String.format("%-20s", "toUri: ") + p1.toUri());  // 브라우저에서 사용 가능한 경로 . 
		// roUri 메서드는 운영체제에서 경로(Path)가 아닌 인터넷의 경로를 return한다. ( return 된 값을 인터넷 브라우저에 입력 시 내용이 나옴, ) 
		System.out.println(); 
		
		Path p2 = Paths.get("./src/check/");  // = Paths.get("./src/없는폴더/"); 일 경우 p2.toAbsolutePath()는 정상 출력 p2.toRealPath()는 에러 발생
		// Paths.get 메소드를 통해 해당 경로를 p2에 저장 
		System.out.println(String.format("%-20s",  "toString: " ) + p2.toString()); 
		System.out.println(String.format("%-20s",  "toAbsolutePath: ") + p2.toAbsolutePath()); 
		// toAbsolutePath메서드는 실제 경로가 있는지 없는지는 확인하지 않고 그냥 절대 경로인 문자열만 return 한다. 
	
		try {
			System.out.println(String.format("%-20s", "toRealPath: ") + p2.toRealPath()); 
			// toRealPath 메서드는 실제 p2가 존재하는 절대 경로를 return 하며, 저장된 경로에 폴더나 파일이 실제 존재하는지 체크 후 없을 경우 예외가 발생한다. (checked Exception)
			/*
			 * 즉 위쪽에 Paths.get("./src/check/") 부분에 check를 존재하지 않는 폴더 명으로 변경 시 
			 * toAbsolutePath메서드 호출 시 절대경로가 출력되지만 toRealPath 호출 시 에러발생 아리 < 경로가 존재하지 않을 경우> 
			 */
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		System.out.println(); 
		
		System.out.println("< 경로가 존재하지 않을 경우>"); 
		Path p3 = Paths.get("./src/error/"); 
		try {
			System.out.println(String.format("%-20s",  "toRealPath: ") + p3.toRealPath()); 
		} catch (IOException e) {
			System.out.println(e.getMessage() + " 경로가 존재하지 않습니다."); 
		}
		System.out.println(); 
		
		System.out.println("< 파일 접근성 확인 >"); 
		System.out.println(String.format("%-20s", "exisis(p1): ") + Files.exists(p1)); 
		//Files.exists 메서드를 활용해 아규먼트 경로에 파일 혹은 폴더가 존재하는지 확인 가능하다 
		System.out.println(String.format("%-20s",  "exists(p3): ") + Files.exists(p3));
		System.out.println(String.format("%-20s", "isReadable: ") + Files.isReadable(p1)); 
		//Files.isReadable 메서드는 일기가 가능한지를 return 해준다. 
		System.out.println(String.format("%-20s",  "isWritable: ") + Files.isWritable(p1)); 
		// Files.isExecutable 메서드는 실행이 가능한지를 return 해준다. 
		/// 이 때 가능하다는 말이 읽고 쓰고 실행할 권한이 있는지 여부를 알려주는 것인지 해당 파일이나 폴더가 일고 
		System.out.println(String.format("%-20s",  "isExecuable: ") + Files.isExecutable(p1)); 
		// Files.isExecutable 메서드는 실행이 가능한지를 return 해준다. 
		
		System.out.println("< 파일 정보 >"); 
		try {
			System.out.println(String.format("%-20s", "size: ") + Files.size(p1)); 
			//Files.size 메서드는 해당 경로의 파일 혹은 폴더의 사이즈를 확인할 수 있다. 
		} catch (IOException e1) {
			e1.printStackTrace(); 
		}
		System.out.println(String.format("%-20s",  "isDirectory: ") + Files.isDirectory(p1)); 
		// Files.isDirectory  메서드는 해당 경로가 파일인지 디렉토리(폴더)인지 true false로 Return한다 
		System.out.println(); 
		
		
		System.out.println("< new BufferedReader >"); 
		try (BufferedReader in = Files.newBufferedReader(p1, Charset.forName("UTF-8"))){
			
			// p1 경로에 있는 파일을 UTF-8 타입으로 인코딩하여 BufferedReader클래스로 return 
			/*
			 * 기존 io클래스에 있는 BufferedReader(test  ) 를 사용했다면 = new BufferedReader(new FileReader("src/test/benson.txt)); 입력해야하는 번거로
			 * 즉 , 비교하자면 텍스트 파일을 효율적으로 읽고 특정 인코딩을 지정할 수 있다는 장점이 있다. 
			 */
			
			String line = null; 
			int num = 0; 
			while((line = in.readLine()) != null) {
				// readLine 메서드는 줄단위로 읽어오는 메서드이다 (한 줄 읽어오고 재실행(반복) 시 다음줄 읽어옴) 
				// 더이상 읽어올 줄이 없다면 null을 return 한다. 
				System.out.println(++num + ": " + line); 
			}
		} catch (IOException e) {
			e.printStackTrace(); 
		} 
		System.out.println(); 
	
	}
}
