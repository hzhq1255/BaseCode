package main

import (
	"fmt"
	"time"
)

var cache = map[string]string{}

func printTime() {
	fmt.Printf("current time = %v\n", time.Now())
}
func Init() {
	ticker := time.NewTicker(5 * time.Second)
	go func() {
		for {
			select {
			case <-ticker.C:
				printTime()
			}
		}
	}()
}

func main() {
	Init()
	time.Sleep(100 * time.Second)
	fmt.Printf("main thread completed at %v ....\n", time.Now())
}
