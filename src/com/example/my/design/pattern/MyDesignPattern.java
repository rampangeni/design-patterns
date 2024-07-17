package com.example.my.design.pattern;

public class MyDesignPattern {
    public static void main(String[] args) {

        System.out.println("SINGLETON DESIGN PATTERN");
        {
            System.out.println("1. EagerInitializedSingleton");
            EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

            System.out.println("2. StaticBlockSingleton");
            StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

            System.out.println("3. LazyInitializationSingleton");
            LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();

            System.out.println("4. ThreadSafeSingleton");
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

            System.out.println("5. ThreadSafeLockingSingleton");
            ThreadSafeLockingSingleton threadSafeLockingSingleton = ThreadSafeLockingSingleton.getInstance();
        }

        System.out.println("FACTORY DESIGN PATTERN");
        {
            System.out.println("6. FactoryDesignPattern");
            FactorySuperClass first = FactoryDesignPattern.getChildClass("FIRST", "first");
            System.out.println(first);
            FactorySuperClass second = FactoryDesignPattern.getChildClass("SECOND", "second");
            System.out.println(second);
            FactorySuperClass third = FactoryDesignPattern.getChildClass("THIRD", "third");
            System.out.println(third);
        }

        System.out.println("ABSTRACT FACTORY DESIGN PATTERN");
        {

        }

        System.out.println("BUILDER DESIGN PATTERN");
        {
            System.out.println("7. BuilderDesignPattern");
            Student student = new Student.Builder()
                    .setFirstName("ram")
                    .setLastName("pangeni")
                    .setRollNumber(30)
                    .build();
            System.out.println(student);
        }
    }
}
