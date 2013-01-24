premise: 1. a > 0 && b > 0 && a > b 
	 2. a % d == 0 && b % d == 0

cause  : a % d == 0 && b % d ==0
then   : a = m * d, b = n * d		// (1)

suppose: r = a % b
then   : r = a - x * b			// (2)

base (1) & (2) 
       : r = (m * d) - x * (n * d) 
       : r = (m - x * n) * d

so     : r % d == 0

