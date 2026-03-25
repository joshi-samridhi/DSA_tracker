🧠 1. What is Time Complexity?

👉 Definition (simple):
Time Complexity tells us
➡ how fast your code runs as input size (n) increases

  

🍕 Real-Life Analogy (Never Forget This)

Searching a contact in phone:
Scroll one by one → O(n) 😩
Use search bar → O(log n) 🚀

👉 Same data, different speed = different algorithm


 2. 👉 Big O = Worst-case performance


  🟢 O(1) — Constant Time
int x = arr[0];
System.out.println(x);
👉 Always 1 step (no matter array size)
🧠 Think:
"No loop = mostly O(1)"


  🟡 O(n) — Linear Time
for(int i = 0; i < n; i++){
    System.out.println(arr[i]);}
👉 Runs n times
🧠 Think:
"Single loop = O(n)"


  🔴 O(n²) — Quadratic Time
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.println(arr[i] + " " + arr[j]);
    }
}👉 n × n = n²
⚠️ Dangerous for big input



  🚀 O(log n) — Logarithmic (VERY IMPORTANT)
int i = 1;
while(i < n){
    i = i * 2;
👉 Steps:
1 → 2 → 4 → 8 → 16 (getting double)
🧠 Think:
"If input halves or doubles → O(log n)"



  🔥 O(n log n)
Used in:
Sorting algorithms (Merge Sort)


  

🎯 4. Golden Rules (MEMORIZE THIS)
  
1. Remove constants → O(2n) = O(n)
2. Keep highest power → O(n² + n) = O(n²)
3. Nested loops multiply
4. Separate loops add → O(n + n) = O(n)


🎨 5. Visual Growth (Key Insight)
n = 100
O(n)   → 100 steps ✅
O(n²)  → 10,000 steps ❌
O(log n) → ~7 steps 🚀


🧪 6. Practice 
✅ Q1
for(int i = 0; i < n; i++){
    for(int j = 0; j < 10; j++){
        System.out.println(i + " " + j);
    }
}👉 Answer:
✔ O(n) (because 10 is constant)


  ✅ Q2
for(int i = 0; i < n; i++){
    for(int j = 0; j < i; j++){
        System.out.println(i + " " + j);
👉 Answer:
✔ O(n²)

✅ Q3
int i = 1;
while(i < n){
    i *= 2;
}👉 Answer:
✔ O(log n)  


 🧠 8. Memory Trick (Never Forget)
Whenever you see code, ask:
👉 “How many times is this running?”
That’s it. That’s the whole game. 

  
🧠 FINAL MEMORY TRICK (VERY IMPORTANT!!!!!!!!)

Whenever you see code:
👉 Ask 3 things:

1.Is there a loop? → O(n)
2.Nested loop? → O(n²)
3.Dividing input? → O(log n)


🔥 NOW LET’S UNDERSTAND YOUR 4 RULES (WITH REAL INTERVIEW CASES)
✅ Rule 1: Remove Constants
O(2n) = O(n)
for(int i = 0; i < n; i++){
    System.out.println(i);
}

for(int i = 0; i < n; i++){
    System.out.println(i);
}
👉 Runs n + n = 2n
✔ Final Answer: O(n)

  

🧠 Interview Tip:
We ignore constants because for large n, they don’t matter

  

✅ Rule 2: Keep Highest Power
O(n² + n) = O(n²)
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.println(i + " " + j);
    }
}

for(int i = 0; i < n; i++){
    System.out.println(i);
}
👉 n² + n
✔ Final Answer: O(n²)
🧠 Why?
Because n² dominates growth


  

✅ Rule 3: Nested Loops Multiply
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        // work
    }
}
✔ O(n × n) = O(n²)
✅ Rule 4: Separate Loops Add
for(int i = 0; i < n; i++){
    System.out.println(i);
}

for(int j = 0; j < n; j++){
    System.out.println(j);
}

✔ O(n + n) = O(2n) → O(n)

🎯 HOW INTERVIEWER THINKS
They don’t just want answer.
They want explanation like this:
👉 “This loop runs n times, inner loop runs n times, so total is n². Therefore time complexity is O(n²).”




🧪 REAL INTERVIEW QUESTION
👉 Question:
Find sum of all pairs
for(int i = 0; i < n; i++){
    for(int j = i; j < n; j++){
        sum += arr[i] + arr[j];
    }
}
🔍 Your Answer:
Outer loop → n
Inner loop → ~n
✔ Final: O(n²)

  
