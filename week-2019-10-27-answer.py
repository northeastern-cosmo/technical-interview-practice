def max_sum(arr, k): 
    n = len(arr)
    # k must be greater 
    if (n < k): 
        print("length of array must be greater than k") 
        return -1
      
    # sum the first window
    prev_sum = 0
    for i in range(k): 
        prev_sum += arr[i] 
  
    # compare the rest of the windows
    max_start = 0
    for i in range(k, n): 
        # get the current sum by adding the last and subtracting the first:
        # if full array is [1, 2, 3, 4, 5] and k = 3
        # [1, 2, 3] = 6
        # prev_sum + arr[1] - arr[i - k]
        #    6     +   4    -     1      = 9
        # [2, 3, 4] = 9
        curr_sum = prev_sum + arr[i] - arr[i-k]
        if curr_sum > prev_sum:
          prev_sum = curr_sum
          max_start = i - k + 1
  
    return arr[max_start:max_start + k]
