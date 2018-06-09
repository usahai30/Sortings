# Sortings
Insertion Sort vs Selection Sort vs Merge Sort vs Quick Sort


--- | Best Case | Average Case | Worst Case | 
--- | --- | --- | --- |
Selection Sort | O(n^2) | O(n^2) | O(n^2) |
Insertion Sort | **O(n)** | O(n^2) | O(n^2) |
Merge Sort | O(nlogn) | O(nlogn) | **O(nlogn)** |
Quick Sort | O(nlogn) | O(nlogn) | **O(n^2)** |


**If facing java.lang.StackOverflowError
Try adding a -Xss argument (or increasing the value of one) to see if this goes away.

A Output of the Random Test Case -

Input|Insertion|Selection|Merge	Quick
10000| 436105|23943152|	3084457|	32820830
20000|	882784|	79095996|	2169202|	63236849
30000|	799338|	94537916|	2863573|	154951972
40000|	741569|	284951141|	4095996|	266388515
50000|	540695|	441793660|	5079594|	387250608
