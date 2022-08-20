package main

import (
	"fmt"
	"time"
)

func sum(s []int, c chan int) {
	fmt.Println("start time = ", time.Now().Unix(), " sum s array = ", s)
	sum := 0
	for _, v := range s {
		sum += v
	}
	c <- sum // send sum to chan c
	fmt.Println("end time = ", time.Now().Unix(), " sum s array = ", s, " now sum ", sum)
}

// multiple goroutine need swap value use channel
//  no data input cannot output form channel
// if you do that will appear error deadlock failed
func main() {
	s := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	//  init chan int
	c := make(chan int, 5)
	// channel FIFO(first in first out)
	go sum(s[:len(s)/2], c)
	//time.Sleep(10 * time.Millisecond)
	go sum(s[len(s)/2:], c)
	// receive sum value form chan int c
	x, y := <-c, <-c  // receive from channel c
	fmt.Println(x, y) // disorder(无序)

}
