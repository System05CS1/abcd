// A public class that prints "class A" when its method is called
public class PublicA {
  public void displayPublicA() {
    System.out.println("class A");
  }
}

// A public class that prints "class B" and a protected variable when its method is called
public class PublicB {
  protected int m = 10;
  public void displayPublicB() {
    System.out.println("class B");
    System.out.println("m=" + m);
  }
}

// A package-private class that prints "this is format class A" when its method is called
class PackageA {
  void displayPackageA() {
    System.out.println("this is format class A");
  }
}

// A package-private class that inherits from PackageA and overrides its method to print "this is form class B"
class PackageB extends PackageA {
  void displayPackageA() {
    System.out.println("this is form class B");
  }
}

// A class that contains the main method and creates an object of PackageB to call its method
class Main {
  public static void main(String args[]) {
    PackageB obj = new PackageB();
    obj.displayPackageA();
  }
}
