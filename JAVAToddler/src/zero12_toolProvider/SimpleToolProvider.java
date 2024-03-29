package zero12_toolProvider;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class SimpleToolProvider {
	public static void main(String[] args) throws Exception {
		// create the source
		File sourceFile = new File("D:\\temp\\Hello.java");
		FileWriter writer = new FileWriter(sourceFile);

		writer.write("public class Hello{ \n" + " public void doit() { \n"
				+ "   System.out.println(\"Hello world\") ;\n" + " }\n" + "}");
		writer.close();

		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				null, null, null);

		fileManager.setLocation(StandardLocation.CLASS_OUTPUT,
				Arrays.asList(new File("/temp")));
		// Compile the file
		compiler.getTask(
				null,
				fileManager,
				null,
				null,
				null,
				fileManager.getJavaFileObjectsFromFiles(Arrays
						.asList(sourceFile))).call();
		fileManager.close();

		// delete the source file
		// sourceFile.deleteOnExit();

		runIt();
	}

	@SuppressWarnings("unchecked")
	public static void runIt() {
//		try {
//			Class params[] = {};
//			Object paramsObj[] = {};
//			Class thisClass = Class.forName("Hello");
//			Object iClass = thisClass.newInstance();
//			Method thisMethod = thisClass.getDeclaredMethod("doit", params);
//			thisMethod.invoke(iClass, paramsObj);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Class params[] = {};
			Object paramsObj[] = {};
            File file = new File("D:\\temp");
            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { file.toURI().toURL() });
            Class thisClass = Class.forName("Hello", true, classLoader);
            Object iClass = thisClass.newInstance();
			Method thisMethod = thisClass.getDeclaredMethod("doit", params);
			thisMethod.invoke(iClass, paramsObj);
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
	}

}
