package main

import "fmt"

func fibonacci() func() int {
	f1, f2 := 0, 1
	return func() int {
		f := f1
		f1, f2 = f2, f2+f1
		return f
	}
}

func main() {
	f := fibonacci()
	for i := 0; i < 10; i++ {
		fmt.Println(i, f())
	}
	fibo := [10]int{}
	for i := 0; i < 10; i++ {
		if i == 0 || i == 1 {
			fibo[i] = i
			fmt.Println(i)
		} else {
			fibo[i] = fibo[i-1] + fibo[i-2]
			fmt.Println(fibo[i])
		}
	}
}
