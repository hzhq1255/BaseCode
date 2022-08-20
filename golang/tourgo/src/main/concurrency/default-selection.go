package main

import (
	"fmt"
	"time"
)

func main() {
	tick := time.Tick(100 * time.Millisecond)
	boom := time.After(500 * time.Millisecond)
	for {
		select {
		case <-tick:
			fmt.Println("tick.")
		case <-boom:
			fmt.Println("BOOM!")
			return
		// if no data send to tick or boom chan
		// then select default to execute
		// avoid blocking the program
		default:
			fmt.Println(".......")
			time.Sleep(50 * time.Millisecond)
		}

	}
}
