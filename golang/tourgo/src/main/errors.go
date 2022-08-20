package main

import (
	"fmt"
	"time"
)

type MyError struct {
	When time.Time `json:"when"`
	What string    `json:"what"`
}

func (e *MyError) Error() string {
	return fmt.Sprintf("at %v , %s", e.When, e.What)
}

func run() error {
	return &MyError{time.Now(), "is didn't work"}
}

func main() {
	if err := run(); err != nil {
		fmt.Println(err)
	}
}
