void sort(Stack<Integer> s) {
	Stack<Integer> r = new Stack<Integer>();
	while(!s.isEmpty()) {
		/* Insert each element in s in sorted order into r. */
		int tmp = s.pop();
		while(!r.isEmpty() && r.peek() > tmp) {
			s.push(r.pop()); 
		}
		r.push(tmp); 
	}
	
	/* Copy the elements from r back into s. */ 
	while (!r.isEmpty()) {
		s.push(r.pop()); 
	}
}
