package main

import (
	"fmt"
	"io"
	"strings"
)

func main() {
	var r = strings.NewReader("Hello, Reader!")

	var b = make([]byte, 8)
	for {
		var n, err = r.Read(b)
		fmt.Printf("n = %v err = %v b = %v \n", n, err, b)
		fmt.Printf("b[:n] = %q \n", b[:n])
		if err == io.EOF {
			break
		}
	}

	fmt.Println("This is a go hello program")
}