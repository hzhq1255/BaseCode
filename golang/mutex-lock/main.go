package main

import (
	"bufio"
	"fmt"
	"os"
	"runtime"
	"sync"
)

var lock = &sync.Mutex{}

func writeA() {
	lock.Lock()
	defer lock.Unlock()
	fmt.Print("A")

}

func writeB() {
	lock.Lock()
	defer lock.Unlock()
	fmt.Print("B")

}

func writeC() {
	lock.Lock()
	defer lock.Unlock()
	fmt.Print("C")
}

func writeFile(s string) error {
	f, err := os.OpenFile("a.txt", os.O_APPEND|os.O_RDWR, 0755)
	if err != nil {
		return err
	}
	defer f.Close()
	if err != nil {
		return err
	}
	w := bufio.NewWriter(f)
	_, err = w.WriteString(s + "\n")
	if err != nil {
		return err
	}
	w.Flush()

	return nil
}

func main() {
	runtime.GOMAXPROCS(10)
	var wg sync.WaitGroup

	wg.Add(3)

	go func() {
		defer wg.Done()
		for i := 0; i < 10; i++ {
			writeA()
		}
	}()

	go func() {
		defer wg.Done()
		for i := 0; i < 10; i++ {
			writeB()
		}
	}()
	go func() {
		defer wg.Done()
		for i := 0; i < 10; i++ {
			writeC()
		}
	}()

	wg.Wait()
}
