package main

import (
	"golang.org/x/tour/reader"
)

type MyReader struct{}

func (r MyReader) Read(b []byte) (n int, err error) {
	b = b[:cap(b)]

	for i := range b {
		b[i] = 'A'
	}
	return cap(b), nil
}

// 实现输出 A 的无限字节流
func main() {

	reader.Validate(MyReader{})

}
