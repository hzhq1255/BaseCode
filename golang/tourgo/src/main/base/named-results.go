package main

import "fmt"

// named function result
func split(sum int) (x, y int) {
	x = sum * 4 / 9
	y = sum - x
	return
}

func main() {
	var x, y = split(36)
	fmt.Println(x, y)
}

