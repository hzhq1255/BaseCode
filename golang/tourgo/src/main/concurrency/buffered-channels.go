package main

import "fmt"

func bufferedChannel(ins []int, c chan int) {
	for i := 0; i < len(ins); i++ {
		c <- ins[i]
	}
}

func main() {
	ch := make(chan int, 2)
	ch <- 1
	ch <- 2
	fmt.Println(<-ch)
	fmt.Println(<-ch)
	// deadlock
	// buffered channel has already been filled
	bufferedChannel([]int{1, 2}, make(chan int, 1))
}
