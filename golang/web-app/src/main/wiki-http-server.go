package main

import (
	"fmt"
	"net/http"
)

var pagePath = "../bin"

func ViewHandler(w http.ResponseWriter, r *http.Request) {
	title := r.URL.Path[len("/view/"):]
	p, _ := LoadPage(title, pagePath)
	fmt.Fprintf(w, "<h1>%s</h1><div>%s</div>", p.Title, p.Body)
}

//func main() {
//	http.HandleFunc("/", viewHandler)
//	log.Fatalln(http.ListenAndServe(":8080", nil))
//}
