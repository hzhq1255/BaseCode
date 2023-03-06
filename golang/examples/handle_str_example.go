package main

import (
	"fmt"
	"strings"
)

func main() {
	s1 := "selector.aaa."
	key := strings.Split(s1, "=")[0]
	keys := make([]string, len(key))
	k := 0
	temp := ""
	for i := 0; i < len(key); i++ {
		v := string(key[i])
		vPrev := ""
		if i-1 > 0 {
			vPrev = string(key[i-1])
		}

		fmt.Println("temp", temp)
		if v == "." {
			if vPrev != "\\" {
				keys[k] = temp
				temp = ""
				k++
				continue
			} else {
				temp = temp[:len(temp)-1]
			}
		}
		temp += v
		if i == len(key)-1 {
			keys[k] = temp
			temp = ""
			k++
		}
	}

	for i, v := range keys[:k] {
		fmt.Printf("i=%v, v=%v\n", i, v)
	}
}
