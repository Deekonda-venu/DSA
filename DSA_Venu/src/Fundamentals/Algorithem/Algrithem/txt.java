//package Fundamentals.Algorithem.Algrithem;
//
//public class txt {
//    DSA FUNDAMENTALS: ALGORITHM ANALYSIS (NOTES)
//🔹 1. What is Algorithm Analysis?
//
//            👉 Definition (simple):
//    Algorithm analysis means
//👉 “How fast my code runs as input increases”
//
//            ✔️ We measure:
//
//    Time ⏱️ (how many steps)
//    Space 📦 (how much memory)
//            🔹 2. Why Do We Need It?
//
//            👉 Because we can have multiple solutions
//
//🎯 Example:
//
//    Find a number in array:
//
//    Using loop → O(n)
//    Using HashSet → O(1)
//
//👉 Which is better?
//            👉 We need analysis to decide
//
//🔥 KEY IDEA
//
//👉 Faster code = better performance = better interview answer
//
//🔹 3. What is Time Complexity?
//
//            👉 It tells:
//    How many times code runs
//
//✔️ Common Complexities:
//    Complexity	Meaning
//    O(1)	Constant (fastest)
//    O(log n)	Very fast
//    O(n)	Linear
//    O(n²)	Slow
//🔹 4. How to Calculate (Simple Rules)
//✅ Rule 1: Count loops
//1 loop → O(n)
//2 nested loops → O(n²)
//✅ Rule 2: Divide / multiply
//            i = i * 2 → O(log n)
//    i = i / 2 → O(log n)
//✅ Rule 3: Nested loops
//
//👉 Multiply
//
//    O(n) × O(log n) = O(n log n)
//✅ Rule 4: Separate loops
//
//👉 Add
//
//    O(n) + O(n) = O(n)
//🔹 5. Best, Average, Worst Case
//    Case	Meaning
//    Best	Fastest
//    Average	Normal
//    Worst	Slowest (IMPORTANT)
//
//👉 We mostly use Worst Case
//
//🔹 6. Where Do We Use This?
//
//            👉 EVERYWHERE in DSA
//
//✔️ When solving problems:
//    Compare brute force vs optimized
//    Choose best approach
//🔹 7. Arrays vs Collections (IMPORTANT)
//🔸 Arrays
//
//👉 Use when:
//
//    Fixed size
//    Simple operations
//    Example:
//    int[] arr = {1,2,3};
//    Complexity:
//    Search → O(n)
//    Insert/Delete → O(n)
//🔸 Collections (Java)
//
//👉 Use when:
//
//    Need faster operations
//    Dynamic data
//🔹 1. ArrayList
//    Dynamic array
//    Same as array but flexible
//
//👉 Access → O(1)
//👉 Insert → O(n)
//
//🔹 2. HashSet
//    Stores unique values
//
//👉 Search → O(1) 🔥
//            👉 Insert → O(1)
//
//🔹 3. HashMap
//    Key → Value
//
//👉 Search → O(1) 🔥
//            👉 Insert → O(1)
//
//🔹 4. Stack
//            LIFO
//
//👉 push/pop → O(1)
//
//🔹 5. Queue
//            FIFO
//
//👉 add/remove → O(1)
//
//🔹 8. When to Use What?
//    Situation	Use
//    Simple iteration	Array
//    Fast lookup	HashSet
//    Key-value	HashMap
//    Order important	ArrayList
//    LIFO problems	Stack
//    FIFO problems	Queue
//🔹 9. Real Example (IMPORTANT)
//    Problem: Check duplicate
//❌ Array approach
//for(int i=0;i<n;i++){
//        for(int j=i+1;j<n;j++){
//            if(arr[i]==arr[j]) return true;
//        }
//    }
//
//👉 O(n²)
//
//✅ HashSet approach
//    HashSet<Integer> set = new HashSet<>();
//
//for(int num : arr){
//        if(set.contains(num)) return true;
//        set.add(num);
//    }
//
//👉 O(n) 🔥
//
//            🔹 10. Final Summary (Remember This)
//
//👉 Algorithm Analysis =
//✔️ Compare solutions
//✔️ Choose fastest
//✔️ Optimize code
//
//👉 Golden Rules:
//
//    Loop → O(n)
//    Nested → O(n²)
//    Divide → O(log n)
//    HashMap/Set → O(1)
//}
