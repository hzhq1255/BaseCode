package main

import (
	"fmt"
)

func addr() (f func(int) int) {
	var sum int = 0
	f = func(x int) int {
		sum += x
		return sum
	}
	return
}

func main() {
	pos, neg := addr(), addr()
	for i := 0; i < 10; i++ {
		fmt.Println(
			pos(i),
			neg(-2*i),
		)

	}
}
