import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int totalSolved = 0;
    static int totalCorrect = 0;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==========================================");
            System.out.println("              JAVABUDDY");
            System.out.println("       Learn Java. Practice. Code.");
            System.out.println("==========================================");
            System.out.println("1. Learn Java");
            System.out.println("2. Practice");
            System.out.println("3. DSA");
            System.out.println("4. TCS Coding Problems");
            System.out.println("5. Mock Test");
            System.out.println("6. My Progress");
            System.out.println("7. Exit");
            System.out.println("==========================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                learnJava();
            } else if (choice == 2) {
                practice();
            } else if (choice == 3) {
                dsa();
            } else if (choice == 4) {
                tcsProblems();
            } else if (choice == 5) {
                mockTest();
            } else if (choice == 6) {
                progress();
            } else if (choice == 7) {
                System.out.println("\nThank you for using JavaBuddy!");
                System.out.println("Keep learning. Keep coding!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    static void learnJava() {

        while (true) {

            System.out.println("\n========== LEARN JAVA ==========");
            System.out.println("1. Variables");
            System.out.println("2. Data Types");
            System.out.println("3. Operators");
            System.out.println("4. If-Else");
            System.out.println("5. Loops");
            System.out.println("6. Arrays");
            System.out.println("7. Strings");
            System.out.println("8. Methods");
            System.out.println("9. OOP");
            System.out.println("10. Exception Handling");
            System.out.println("11. Collections");
            System.out.println("12. Recursion");
            System.out.println("13. Back");

            System.out.print("Choose topic: ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("\nVARIABLES");
                System.out.println("Variables are used to store data.");
                System.out.println("Example:");
                System.out.println("int age = 20;");
                System.out.println("String name = \"Rajya\";");
            }

            else if (n == 2) {
                System.out.println("\nDATA TYPES");
                System.out.println("int      -> whole numbers");
                System.out.println("double   -> decimal numbers");
                System.out.println("char     -> single character");
                System.out.println("boolean  -> true or false");
                System.out.println("String   -> text");
            }

            else if (n == 3) {
                System.out.println("\nOPERATORS");
                System.out.println("Arithmetic : + - * / %");
                System.out.println("Relational : == != > < >= <=");
                System.out.println("Logical    : && || !");
                System.out.println("Assignment : = += -= *= /=");
            }

            else if (n == 4) {
                System.out.println("\nIF-ELSE");
                System.out.println("Used for decision making.");
                System.out.println("Example:");
                System.out.println("if (age >= 18)");
                System.out.println("    System.out.println(\"Adult\");");
            }

            else if (n == 5) {
                System.out.println("\nLOOPS");
                System.out.println("for loop");
                System.out.println("while loop");
                System.out.println("do-while loop");
            }

            else if (n == 6) {
                System.out.println("\nARRAYS");
                System.out.println("Used to store multiple values.");
                System.out.println("Example:");
                System.out.println("int[] a = {10,20,30};");
            }

            else if (n == 7) {
                System.out.println("\nSTRINGS");
                System.out.println("Used to store text.");
                System.out.println("Example:");
                System.out.println("String name = \"JavaBuddy\";");
                System.out.println("Useful methods:");
                System.out.println("length()");
                System.out.println("charAt()");
                System.out.println("substring()");
                System.out.println("toUpperCase()");
                System.out.println("toLowerCase()");
            }

            else if (n == 8) {
                System.out.println("\nMETHODS");
                System.out.println("Methods divide a program into smaller parts.");
                System.out.println("Example:");
                System.out.println("static void hello() {");
                System.out.println("    System.out.println(\"Hello\");");
                System.out.println("}");
            }

            else if (n == 9) {
                System.out.println("\nOBJECT ORIENTED PROGRAMMING");
                System.out.println("1. Class");
                System.out.println("2. Object");
                System.out.println("3. Encapsulation");
                System.out.println("4. Inheritance");
                System.out.println("5. Polymorphism");
                System.out.println("6. Abstraction");
            }

            else if (n == 10) {
                System.out.println("\nEXCEPTION HANDLING");
                System.out.println("try");
                System.out.println("catch");
                System.out.println("finally");
                System.out.println("throw");
                System.out.println("throws");
            }

            else if (n == 11) {
                System.out.println("\nCOLLECTIONS");
                System.out.println("ArrayList");
                System.out.println("LinkedList");
                System.out.println("HashSet");
                System.out.println("HashMap");
                System.out.println("Stack");
                System.out.println("Queue");
            }

            else if (n == 12) {
                System.out.println("\nRECURSION");
                System.out.println("A method calling itself is recursion.");
                System.out.println("Example:");
                System.out.println("factorial(n) = n * factorial(n-1)");
            }

            else if (n == 13) {
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }

    static void practice() {

        while (true) {

            System.out.println("\n========== PRACTICE ==========");
            System.out.println("1. Variables");
            System.out.println("2. Operators");
            System.out.println("3. If-Else");
            System.out.println("4. Loops");
            System.out.println("5. Arrays");
            System.out.println("6. Strings");
            System.out.println("7. OOP");
            System.out.println("8. Collections");
            System.out.println("9. Back");

            System.out.print("Choose: ");
            int n = sc.nextInt();

            if (n == 1) variablesPractice();
            else if (n == 2) operatorsPractice();
            else if (n == 3) ifElsePractice();
            else if (n == 4) loopsPractice();
            else if (n == 5) arraysPractice();
            else if (n == 6) stringsPractice();
            else if (n == 7) oopPractice();
            else if (n == 8) collectionsPractice();
            else if (n == 9) break;
            else System.out.println("Invalid choice!");
        }
    }

    static int question(
            String q,
            String a,
            String b,
            String c,
            String d,
            int correct) {

        System.out.println("\n" + q);
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("3. " + c);
        System.out.println("4. " + d);

        System.out.print("Your answer: ");
        int answer = sc.nextInt();

        totalSolved++;

        if (answer == correct) {
            System.out.println("Correct!");
            totalCorrect++;
            return 1;
        }

        System.out.println("Wrong!");
        System.out.println("Correct answer: " + correct);
        return 0;
    }

    static void variablesPractice() {

        int score = 0;

        score += question(
                "Which keyword is used for integer?",
                "int", "integer", "num", "number", 1);

        score += question(
                "Which data type stores decimal values?",
                "int", "double", "char", "boolean", 2);

        score += question(
                "Which data type stores one character?",
                "String", "char", "int", "double", 2);

        score += question(
                "Which symbol is assignment operator?",
                "=", "==", "+", "-", 1);

        score += question(
                "Which data type stores true or false?",
                "int", "char", "boolean", "double", 3);

        System.out.println("\nScore: " + score + "/5");
    }

    static void operatorsPractice() {

        int score = 0;

        score += question(
                "What is 10 + 5?",
                "10", "15", "20", "5", 2);

        score += question(
                "What is 10 % 3?",
                "0", "1", "2", "3", 3);

        score += question(
                "Which operator checks equality?",
                "=", "==", "!=", ">", 2);

        score += question(
                "Which operator means AND?",
                "||", "!", "&&", "&", 3);

        score += question(
                "What is 5 * 4?",
                "9", "20", "25", "15", 2);

        System.out.println("\nScore: " + score + "/5");
    }

    static void ifElsePractice() {

        int score = 0;

        score += question(
                "Which keyword is used for condition?",
                "if", "for", "while", "switch", 1);

        score += question(
                "Which keyword runs when if is false?",
                "else", "for", "break", "continue", 1);

        score += question(
                "Which operator means greater than?",
                "<", ">", "==", "!=", 2);

        score += question(
                "What is 10 > 5?",
                "true", "false", "10", "5", 1);

        score += question(
                "What is 5 == 10?",
                "true", "false", "5", "10", 2);

        System.out.println("\nScore: " + score + "/5");
    }

    static void loopsPractice() {

        int score = 0;

        score += question(
                "Which loop is commonly used when count is known?",
                "for", "if", "switch", "try", 1);

        score += question(
                "Which loop checks condition before execution?",
                "while", "do-while", "switch", "if", 1);

        score += question(
                "Which loop executes at least once?",
                "for", "while", "do-while", "if", 3);

        score += question(
                "Which keyword stops a loop?",
                "stop", "exit", "break", "end", 3);

        score += question(
                "Which keyword skips current iteration?",
                "skip", "continue", "break", "pass", 2);

        System.out.println("\nScore: " + score + "/5");
    }

    static void arraysPractice() {

        int score = 0;

        score += question(
                "Array stores?",
                "One value", "Multiple values", "Only text", "Only char", 2);

        score += question(
                "Array index starts from?",
                "0", "1", "-1", "2", 1);

        score += question(
                "Which property gives array size?",
                "size", "length", "count", "length()", 2);

        score += question(
                "What is {10,20,30}[0]?",
                "10", "20", "30", "0", 1);

        score += question(
                "Which symbol creates an array?",
                "[]", "{}", "()", "<>", 1);

        System.out.println("\nScore: " + score + "/5");
    }

    static void stringsPractice() {

        int score = 0;

        score += question(
                "Which class stores text?",
                "String", "Text", "Char", "Word", 1);

        score += question(
                "Which method gives String length?",
                "size()", "length()", "count()", "get()", 2);

        score += question(
                "Which method converts to uppercase?",
                "upper()", "toUpperCase()", "uppercase()", "Upper()", 2);

        score += question(
                "Which method compares Strings?",
                "compare()", "equals()", "===", "check()", 2);

        score += question(
                "String indexing starts from?",
                "0", "1", "-1", "2", 1);

        System.out.println("\nScore: " + score + "/5");
    }

    static void oopPractice() {

        int score = 0;

        score += question(
                "Which is a blueprint for objects?",
                "Class", "Method", "Loop", "Variable", 1);

        score += question(
                "Which keyword creates an object?",
                "new", "create", "object", "make", 1);

        score += question(
                "Which concept hides data?",
                "Encapsulation", "Inheritance", "Loop", "Recursion", 1);

        score += question(
                "Which keyword is used for inheritance?",
                "extends", "inherits", "superclass", "inherit", 1);

        score += question(
                "Same method with different parameters is?",
                "Overloading", "Overriding", "Inheritance", "Abstraction", 1);

        System.out.println("\nScore: " + score + "/5");
    }

    static void collectionsPractice() {

        int score = 0;

        score += question(
                "Which collection stores key-value pairs?",
                "ArrayList", "HashMap", "Stack", "Queue", 2);

        score += question(
                "Which collection does not allow duplicate values?",
                "ArrayList", "HashSet", "LinkedList", "Stack", 2);

        score += question(
                "Which collection follows FIFO?",
                "Stack", "Queue", "HashMap", "Set", 2);

        score += question(
                "Which collection follows LIFO?",
                "Queue", "Stack", "Set", "Map", 2);

        score += question(
                "Which collection is dynamic like an array?",
                "ArrayList", "HashSet", "HashMap", "Queue", 1);

        System.out.println("\nScore: " + score + "/5");
    }

    static void dsa() {

        while (true) {

            System.out.println("\n========== DSA ==========");
            System.out.println("1. Array Problems");
            System.out.println("2. String Problems");
            System.out.println("3. Searching");
            System.out.println("4. Sorting");
            System.out.println("5. Recursion");
            System.out.println("6. Linked List");
            System.out.println("7. Stack");
            System.out.println("8. Queue");
            System.out.println("9. Trees");
            System.out.println("10. HashMap");
            System.out.println("11. Back");

            System.out.print("Choose: ");
            int n = sc.nextInt();

            if (n == 1) arrayDSA();
            else if (n == 2) stringDSA();
            else if (n == 3) searchingDSA();
            else if (n == 4) sortingDSA();
            else if (n == 5) recursionDSA();
            else if (n == 6) linkedListDSA();
            else if (n == 7) stackDSA();
            else if (n == 8) queueDSA();
            else if (n == 9) treeDSA();
            else if (n == 10) hashMapDSA();
            else if (n == 11) break;
            else System.out.println("Invalid choice!");
        }
    }

    static void arrayDSA() {

        System.out.println("\n========== ARRAY PROBLEMS ==========");
        System.out.println("1. Sum");
        System.out.println("2. Maximum");
        System.out.println("3. Minimum");
        System.out.println("4. Reverse");
        System.out.println("5. Second Largest");

        System.out.print("Choose: ");
        int n = sc.nextInt();

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 1) {

            int sum = 0;

            for (int x : a) {
                sum += x;
            }

            System.out.println("Sum = " + sum);
        }

        else if (n == 2) {

            int max = a[0];

            for (int x : a) {
                if (x > max) {
                    max = x;
                }
            }

            System.out.println("Maximum = " + max);
        }

        else if (n == 3) {

            int min = a[0];

            for (int x : a) {
                if (x < min) {
                    min = x;
                }
            }

            System.out.println("Minimum = " + min);
        }

        else if (n == 4) {

            System.out.print("Reverse = ");

            for (int i = size - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        else if (n == 5) {

            Arrays.sort(a);

            System.out.println("Second Largest = " + a[size - 2]);
        }
    }

    static void stringDSA() {

        sc.nextLine();

        System.out.println("\n========== STRING PROBLEMS ==========");
        System.out.println("1. Reverse");
        System.out.println("2. Palindrome");
        System.out.println("3. Count Vowels");
        System.out.println("4. Count Characters");
        System.out.println("5. Anagram Check");

        System.out.print("Choose: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        if (n == 1) {

            String rev = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }

            System.out.println("Reverse = " + rev);
        }

        else if (n == 2) {

            String rev = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }

            if (s.equalsIgnoreCase(rev))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }

        else if (n == 3) {

            int count = 0;

            for (int i = 0; i < s.length(); i++) {

                char ch = Character.toLowerCase(s.charAt(i));

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            System.out.println("Vowels = " + count);
        }

        else if (n == 4) {

            System.out.println("Characters = " + s.length());
        }

        else if (n == 5) {

            String s1 = s.replace(" ", "").toLowerCase();

            System.out.print("Enter second String: ");
            String s2 = sc.nextLine().replace(" ", "").toLowerCase();

            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }

    static void searchingDSA() {

        System.out.println("\n========== SEARCHING ==========");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");

        System.out.print("Choose: ");
        int n = sc.nextInt();

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        if (n == 1) {

            int index = -1;

            for (int i = 0; i < size; i++) {

                if (a[i] == target) {
                    index = i;
                    break;
                }
            }

            if (index == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at index " + index);
        }

        else if (n == 2) {

            Arrays.sort(a);

            int left = 0;
            int right = size - 1;
            boolean found = false;

            while (left <= right) {

                int mid = (left + right) / 2;

                if (a[mid] == target) {
                    found = true;
                    break;
                }

                if (a[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            if (found)
                System.out.println("Element found");
            else
                System.out.println("Element not found");
        }
    }

    static void sortingDSA() {

        System.out.println("\n========== SORTING ==========");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Built-in Sort");

        System.out.print("Choose: ");
        int n = sc.nextInt();

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 1) {

            for (int i = 0; i < size - 1; i++) {

                for (int j = 0; j < size - i - 1; j++) {

                    if (a[j] > a[j + 1]) {

                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }

        else if (n == 2) {
            Arrays.sort(a);
        }

        System.out.print("Sorted = ");

        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    static void recursionDSA() {

        System.out.println("\n========== RECURSION ==========");
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci");

        System.out.print("Choose: ");
        int n = sc.nextInt();

        System.out.print("Enter number: ");
        int value = sc.nextInt();

        if (n == 1) {
            System.out.println("Factorial = " + factorial(value));
        }

        else if (n == 2) {
            System.out.println("Fibonacci = " + fibonacci(value));
        }
    }

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {

        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void linkedListDSA() {

        LinkedList<Integer> list = new LinkedList<>();

        while (true) {

            System.out.println("\n========== LINKED LIST ==========");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Back");

            System.out.print("Choose: ");
            int n = sc.nextInt();

            if (n == 1) {

                System.out.print("Enter value: ");
                list.add(sc.nextInt());

            }

            else if (n == 2) {

                if (list.isEmpty()) {
                    System.out.println("List is empty");
                } else {
                    System.out.println("Removed = " + list.removeFirst());
                }
            }

            else if (n == 3) {
                System.out.println("Linked List = " + list);
            }

            else if (n == 4) {
                break;
            }
        }
    }

    static void stackDSA() {

        Stack<Integer> stack = new Stack<>();

        while (true) {

            System.out.println("\n========== STACK ==========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back");

            System.out.print("Choose: ");
            int n = sc.nextInt();

            if (n == 1) {

                System.out.print("Enter value: ");
                stack.push(sc.nextInt());
            }

            else if (n == 2) {

                if (stack.isEmpty())
                    System.out.println("Stack is empty");
                else
                    System.out.println("Removed = " + stack.pop());
            }

            else if (n == 3) {

                if (stack.isEmpty())
                    System.out.println("Stack is empty");
                else
                    System.out.println("Top = " + stack.peek());
            }

            else if (n == 4) {
                System.out.println("Stack = " + stack);
            }

            else if (n == 5) {
                break;
            }
        }
    }

    static void queueDSA() {

        Queue<Integer> queue = new LinkedList<>();

        while (true) {

            System.out.println("\n========== QUEUE ==========");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back");

            System.out.print("Choose: ");
            int n = sc.nextInt();

            if (n == 1) {

                System.out.print("Enter value: ");
                queue.add(sc.nextInt());
            }

            else if (n == 2) {

                if (queue.isEmpty())
                    System.out.println("Queue is empty");
                else
                    System.out.println("Removed = " + queue.remove());
            }

            else if (n == 3) {

                if (queue.isEmpty())
                    System.out.println("Queue is empty");
                else
                    System.out.println("Front = " + queue.peek());
            }

            else if (n == 4) {
                System.out.println("Queue = " + queue);
            }

            else if (n == 5) {
                break;
            }
        }
    }

    static void treeDSA() {

        System.out.println("\n========== TREE ==========");
        System.out.println("1. Preorder");
        System.out.println("2. Inorder");
        System.out.println("3. Postorder");

        System.out.print("Choose: ");
        int n = sc.nextInt();

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (n == 1) {
            System.out.print("Preorder = ");
            preorder(root);
        }

        else if (n == 2) {
            System.out.print("Inorder = ");
            inorder(root);
        }

        else if (n == 3) {
            System.out.print("Postorder = ");
            postorder(root);
        }

        System.out.println();
    }

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void preorder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {

        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void hashMapDSA() {

        sc.nextLine();

        System.out.println("\n========== HASHMAP ==========");

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }

        System.out.println("Character Frequency:");
        System.out.println(map);
    }

    static void tcsProblems() {

        while (true) {

            System.out.println("\n========== TCS CODING ==========");
            System.out.println("1. Prime Number");
            System.out.println("2. Palindrome Number");
            System.out.println("3. Armstrong Number");
            System.out.println("4. Fibonacci");
            System.out.println("5. Factorial");
            System.out.println("6. GCD and LCM");
            System.out.println("7. Reverse Number");
            System.out.println("8. Sum of Digits");
            System.out.println("9. Count Digits");
            System.out.println("10. Prime Numbers in Range");
            System.out.println("11. Frequency of Digits");
            System.out.println("12. Consecutive Prime Sum");
            System.out.println("13. Back");

            System.out.print("Choose problem: ");
            int n = sc.nextInt();

            if (n == 1) primeProblem();
            else if (n == 2) palindromeProblem();
            else if (n == 3) armstrongProblem();
            else if (n == 4) fibonacciProblem();
            else if (n == 5) factorialProblem();
            else if (n == 6) gcdLcmProblem();
            else if (n == 7) reverseProblem();
            else if (n == 8) digitSumProblem();
            else if (n == 9) digitCountProblem();
            else if (n == 10) primeRangeProblem();
            else if (n == 11) digitFrequencyProblem();
            else if (n == 12) consecutivePrimeSum();
            else if (n == 13) break;
            else System.out.println("Invalid choice!");
        }
    }

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    static void primeProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }

    static void palindromeProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static void armstrongProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }

    static void fibonacciProblem() {

        System.out.print("\nEnter number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    static void factorialProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }

    static void gcdLcmProblem() {

        System.out.print("\nEnter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {

            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    static void reverseProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Reverse = " + reverse);
    }

    static void digitSumProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {

            sum += n % 10;
            n /= 10;
        }

        System.out.println("Digit Sum = " + sum);
    }

    static void digitCountProblem() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Digits = 1");
            return;
        }

        int count = 0;

        while (n != 0) {

            count++;
            n /= 10;
        }

        System.out.println("Digits = " + count);
    }

    static void primeRangeProblem() {

        System.out.print("\nEnter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.print("Prime Numbers: ");

        for (int i = start; i <= end; i++) {

            if (isPrime(i))
                System.out.print(i + " ");
        }

        System.out.println();
    }

    static void digitFrequencyProblem() {

        System.out.print("\nEnter number: ");
        String number = sc.next();

        int[] frequency = new int[10];

        for (int i = 0; i < number.length(); i++) {

            int digit = number.charAt(i) - '0';
            frequency[digit]++;
        }

        for (int i = 0; i < 10; i++) {

            if (frequency[i] > 0)
                System.out.println(i + " -> " + frequency[i]);
        }
    }

    static void consecutivePrimeSum() {

        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {

                sum += i;
                count++;

                if (sum == n) {
                    System.out.println("Consecutive prime numbers found.");
                    System.out.println("Number of primes = " + count);
                    return;
                }

                if (sum > n)
                    break;
            }
        }

        System.out.println("No consecutive prime sum found.");
    }

    static void mockTest() {

        int score = 0;

        System.out.println("\n========== JAVA MOCK TEST ==========");

        score += question(
                "Which keyword creates an object?",
                "new", "create", "object", "class", 1);

        score += question(
                "Which is not a primitive data type?",
                "int", "double", "String", "char", 3);

        score += question(
                "Which loop executes at least once?",
                "for", "while", "do-while", "if", 3);

        score += question(
                "Which keyword exits a loop?",
                "continue", "break", "exit", "stop", 2);

        score += question(
                "Which data structure follows FIFO?",
                "Stack", "Queue", "Tree", "Array", 2);

        score += question(
                "Which data structure follows LIFO?",
                "Queue", "Stack", "Array", "Tree", 2);

        score += question(
                "Array index starts from?",
                "0", "1", "-1", "2", 1);

        score += question(
                "Which method compares Strings?",
                "equals()", "compare()", "check()", "same()", 1);

        score += question(
                "Which keyword is used for inheritance?",
                "implements", "extends", "inherits", "super", 2);

        score += question(
                "Which keyword refers to current object?",
                "self", "this", "current", "object", 2);

        score += question(
                "Which collection stores key-value pairs?",
                "ArrayList", "HashMap", "Stack", "Queue", 2);

        score += question(
                "Which keyword handles exceptions?",
                "try", "check", "error", "exception", 1);

        score += question(
                "Which sorting algorithm repeatedly swaps adjacent elements?",
                "Bubble Sort", "Binary Search", "DFS", "Hashing", 1);

        score += question(
                "Which search works on a sorted array?",
                "Linear Search", "Binary Search", "DFS", "BFS", 2);

        score += question(
                "Which keyword returns a value from a method?",
                "return", "send", "get", "value", 1);

        score += question(
                "Which collection does not allow duplicate values?",
                "ArrayList", "HashSet", "LinkedList", "Queue", 2);

        score += question(
                "Which data structure is used in recursion?",
                "Stack", "Queue", "Array", "HashMap", 1);

        score += question(
                "What is 10 % 3?",
                "0", "1", "2", "3", 3);

        score += question(
                "Which method gives String length?",
                "size()", "length()", "count()", "get()", 2);

        score += question(
                "Which keyword is used to inherit a class?",
                "extends", "inherit", "inherits", "parent", 1);

        System.out.println("\n================================");
        System.out.println("MOCK TEST SCORE = " + score + "/20");
        System.out.println("================================");
    }

    static void progress() {

        System.out.println("\n========== MY PROGRESS ==========");
        System.out.println("Questions Attempted : " + totalSolved);
        System.out.println("Correct Answers     : " + totalCorrect);

        if (totalSolved > 0) {

            double percentage =
                    (totalCorrect * 100.0) / totalSolved;

            System.out.println("Accuracy            : "
                    + String.format("%.2f", percentage) + "%");
        }

        else {
            System.out.println("Accuracy            : 0%");
        }
    }
}