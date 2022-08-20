package main

import "fmt"

// return multiple results
func swap(x, y string) (string, string) {
	return y, x
}

func main() {
	fmt.Println(swap("a", "b"))
}
