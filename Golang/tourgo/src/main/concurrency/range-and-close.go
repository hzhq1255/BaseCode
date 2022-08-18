package main

import "fmt"

func fibonacci(n int, c chan int) {
	var i, x, y = 0, 0, 1
	for ; i < n; i++ {
		c <- x
		x, y = y, x+y
	}
	close(c)
}

func main() {
	var c = make(chan int, 10)
	go fibonacci(cap(c), c)
	// the loop will receive the value form channel util the channel is closed
	// attention: only sender can close the channel
	for i := range c {
		fmt.Println(i)
	}

}
