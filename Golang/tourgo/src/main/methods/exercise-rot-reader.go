package main

import (
	"io"
	"os"
	"strings"
)

type rot13Reader struct {
	r io.Reader
}

func (rot13 *rot13Reader) Read(b []byte) (n int, err error) {
	n, err = rot13.r.Read(b)
	for i, v := range b {
		b[i] = DecodeRot13(v)
	}
	return
}

func DecodeRot13(b byte) byte {
	if (b <= 'Z' && b >= 'N') || (b <= 'z' && b >= 'n') {
		b -= 13
		return b
	}
	if (b <= 'M' && b >= 'A') || (b <= 'm' && b >= 'a') {
		b += 13
		return b
	}
	return b
}

func main() {
	s := strings.NewReader("Lbh penpxrq gur pbqr!")
	r := rot13Reader{s}
	if _, err := io.Copy(os.Stdout, &r); err != nil {
		return
	}
}
