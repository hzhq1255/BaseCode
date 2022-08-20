package main

import "fmt"

func main() {
	sum, i := 0, 0
	// ignore declare var i = 0
	for ; i < 10; i++ {
		sum += i
	}
	fmt.Println(sum)
}
