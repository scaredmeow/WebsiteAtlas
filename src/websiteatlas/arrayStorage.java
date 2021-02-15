/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websiteatlas;

/**
 *
 * @author Other
 */
public class arrayStorage {
        String[][] pdfStorage ={
            {"resources/html/HTML-Week-1.pdf",
            "resources/html/HTML-Week-2.pdf",
            "resources/html/HTML-Week-3.pdf",
            "resources/html/HTML-Week-4.pdf",
            "resources/html/HTML-Week-5.pdf",
            "resources/html/HTML-Week-6.pdf",
            "resources/html/HTML-Week-7.pdf"},            
            {"resources/css/CSS-Week-1.pdf",
            "resources/css/CSS-Week-2.pdf",
            "resources/css/CSS-Week-3.pdf",
            "resources/css/CSS-Week-4.pdf"},
            {"resources/js/JS-Week-1.pdf",
            "resources/js/JS-Week-2.pdf",
            "resources/js/JS-Week-3.pdf",
            "resources/js/JS-Week-4.pdf"},
            {"resources/sql/SQL-Week-1.pdf",
            "resources/sql/SQL-Week-2.pdf",
            "resources/sql/SQL-Week-3.pdf"}
            };               
    String[][][] Question = {
        {
            {"What does HTML stand for?", 
            "The correct sequence of HTML tags for starting a webpage is -",
            "Which is the correct sequence of HTML tags?",
            "Which is the correct HTML element for the largest heading?",
            "Which of the following HTML elements is used for making any text bold?",
            "Which of the following HTML elements is used for inserting a line break?",
            "Choose the correct HTML element to define emphasized text",
            "How many heading tags are there in HTML5?",
            "HTML comments start with <!-- and end with -->",
            "Which of the following characters indicate closing of a tag?"}, 
            {},
            {}},
         {{
            },
          {
        }}};

    String[][][][] Answer = {
        {
                            { 
                                {"A. HighText Machine Language",
                                "B. HyperText and links Markup Language",
                                "C. HyperText Markup Language",
                                "D. None of these"   
                            },
                                {"A. Head, Title, HTML, Body",
                                "B. HTML, Body, Title, Head",
                                "C. HTML, Title, Head, Body",
                                "D. HTML, Head, Title, Body"
                            },
                                {"A. Html, Head, Title, Body",
                                "B. Body, Title, Head, Html",
                                "C. Html, Title, Head, Body",
                                "D. Title, Head, Body, Html"
                            },
                                {"A. <h6>",
                                "B. <h4>",
                                "C. <h5>",
                                "D. <h1>"
                            },                                
                                {"A. <li>",
                                "B. <i>",
                                "C. <b>",
				"D. <br>"
                            },
                                {"A. <break>",
				"B. <br>",
				"C. <rb>",
				"D. </br/>"
                            },
                                {"A. <i>",
				"B. <important>",
				"C. <em>",
				"D. <emphasized>"
                            },         
                                {"A. 5",
				"B. 7",
				"C. 4",
				"D. 6"
                            },   
                                {"A. True",
				"B. False",
                                "C. None of the Above",
                                "D. Not True and Not False"                                       
                            },   
                                {"A. .",
				"B. /",
				"C. \\",
				"D. !"
                            },                                   
                                }
        }
                            };
    String[][][] Correct = {
        {
                            {"C","D","A","D","C","B","C","D","A","B"}, 
                            {}
        }
                            };
    public String[][] arrayPDFStorage(){
        return pdfStorage;
    }
    public String[][][] arrayQuestionStorage() {
        return Question;
    }
}


