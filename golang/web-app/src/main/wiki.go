package main

import (
	"os"
)

type Page struct {
	Title string
	Body  []byte
}

// Save write file to local
func (p *Page) Save(path string) error {
	fileName := path + "/" + p.Title + ".txt"
	return os.WriteFile(fileName, p.Body, 0600)
}

// LoadPage  from local file
func LoadPage(title string, path string) (*Page, error) {
	filename := path + "/" + title + ".txt"
	body, err := os.ReadFile(filename)
	if err != nil {
		return nil, err
	}
	return &Page{Title: title, Body: body}, nil
}

// go build wiki.go -o ../../bin
//func main() {
//	p1 := &Page{Title: "TestPage", Body: []byte("This is a sample page.")}
//	p1.Save("")
//	p2, _ := LoadPage("TestPage", "")
//	fmt.Println(string(p2.Body))
//}
