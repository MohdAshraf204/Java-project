import java.util.*;

class Project1 {
    public static void main (String [] args)
    {
        int choice;
        int st = 1;
        Scanner sc = new Scanner (System.in);    
        do{
        System.out.println("***OPERATIONS***");
        System.out.println("1. Factorial");
        System.out.println("2. Prime Number");
        System.out.println("3. Print Fibonacci Series");
        System.out.println("4. Find Biggest among two numbers");
        System.out.println("5. Check if the number is Even or Odd");
        System.out.println("6. Exit the Program!");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            Factorial f = new Factorial();
            int factResult = f.Fact();
            f.show(factResult);
            break;
            case 2:
            Primes p = new Primes();
            p.isprime();
            break;
            case 3:
            Fibonacci fi = new Fibonacci(); 
            fi.Fib();
            break;
            case 4:
            Comparison com = new Comparison();
            com.comp();
            break;
            case 5:
            Even_or_Odd eo = new Even_or_Odd(); 
            eo.even_or_odd();
            break;
            case 6:
            System.out.println("Exiting the program!!");
             System.exit(0);
            break;
            default:
            System.out.println("INVALID CHOICE!");
        }
        
        System.out.println("Do you want to continue? ( [1] for YES or [0] for NO):");
        st = sc.nextInt();

    } while (st == 1);
    sc.close();
}
}

class Factorial {
    int fact = 1, i, num;

    int Fact() {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact; 
    }
    void show(int factResult) {
        System.out.println("The factorial of " +num + " is: " + factResult);
    }
}

class Primes {
    void isprime() {
        int num, i;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " is not a Prime Number");
            return;
        }
        for (i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a Prime Number");
                return;
            }
        }
        System.out.println(num + " is a Prime number");
    }
}

class Fibonacci {
    void Fib() {
        Scanner sc = new Scanner(System.in);
        int n, firstNum = 0, secondNum = 1, i, temp;
        System.out.print("Enter the number  : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print(firstNum + " , ");
            temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }
        System.out.println();  
    }
}

class Comparison {
    void comp() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();
        if (a > b) {

            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a); 
        }
    }
}

class Even_or_Odd {
    void even_or_odd() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

