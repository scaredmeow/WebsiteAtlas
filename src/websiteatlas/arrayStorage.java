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
        String[][] pathWeek = { {"htmlw1","htmlw2", "htmlw3", "htmlw4", "htmlw5", "htmlw6", "htmlw7"},
                                {"cssw1", "cssw2", "cssw3", "cssw4"},
                                {"jsw1", "jsw2", "jsw3", "jsw4"},
                                {"sqlw1", "sqlw2", "sqlw3"}};
        String[][] sideColor = {{"htmlSelect","htmlSelect1","htmlSelect2","htmlSelect3","htmlSelect4","htmlSelect5","htmlSelect6","htmlSelect7"},
                                        {"cssSelect","cssSelect1","cssSelect2","cssSelect3","cssSelect4"},
                                        {"jsSelect","jsSelect1","jsSelect2","jsSelect3","jsSelect4"},
                                        {"sqlSelect","sqlSelect1","sqlSelect2","sqlSelect3"}};
                
        String[][] mainTab = {{"htmlView","htmlWeek1","htmlWeek2","htmlWeek3","htmlWeek4","htmlWeek5","htmlWeek6","htmlWeek7"},
                                      {"cssView","cssWeek1","cssWeek2","cssWeek3","cssWeek4"},
                                      {"jsView","jsWeek1","jsWeek2","jsWeek3","jsWeek4"},
                                      {"sqlView","sqlWeek1","sqlWeek2","sqlWeek3"}};
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
            
            {"resources/js/JavaScript-Week-1.pdf",
            "resources/js/JavaScript-Week-2.pdf",
            "resources/js/JavaScript-Week-3.pdf",
            "resources/js/JavaScript-Week-4.pdf"},
            
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
            //2
            {"What is the correct HTML for creating a hyperlink?",
            "What do you call a link that is underlined and blue?",
            "What do you call a link that is underlined and purple?",
            "What do you call a link that is underlined and red?",
            "This target attribute opens the document in the same window/tab as it was clicked",
            "This target attribute opens the document in a new windows or tab",
            "This target attribute opens the document in the parent frame",
            "This target attribute opens the document in the full body of the window",
            "Images cannot be links",
            "A local link (a link to a page within the same website) without the \"https://www\" part"},
            //3--
            {"What is the correct HTML for inserting an image?",
            "For specifying the height and width of an image which attribute is used in image tag?",
            "Which of the following is NOT included in the IMAGE tag code?",
            "Which of the following is included in the image tag code?",
            "Which tag should be used to include the following image: cat.jpeg?",
            "What is missing from this image tag <img=\"cat.jpeg\" alt=\"cat\"/>?",
            "What is missing from the following image tag? <img src = cat.jpeg alt = cat jumping / >",
            "Which is an example of a complete image tag?",
            "What is missing from the following image tag? <img src =\"\" alt =\"Cat Jumping\"/>",
            "What is missing from the following image tag? <img src = \"cat.jpeg\" alt = \"cat jumping\"/>"},
            //4
            {"Which of these elements are all <table> elements?",
            "Which tag is used to add a header in HTML5 table?",
            "Starting tag of a table",
            "A <tr> element can have 0 <td> elements inside",
            "To add rows to your tables use which tags?",
            "To create columns inside a row you can use what elements?",
            "You can define a cell as a header for a group of table cells using what element?",
            "You can use what attribute to create a cell that spans more than one row?",
            "ou can specify a caption (or title) for your tables using what element?",
            "Which is the correct way of defining a table footer?"},
            //5
            {"Which of the following HTML element is used for creating an unordered list?",
            "How can you make a numbered list?",
            "What is a list with bullets called?",
            "What is a list with numbers called?",
            "What is the correct syntax for items inside a list?",
            "It is used to create a list of terms and their descriptions.",
            "How do you make a description list?",
            "Used in conjunction with the <dl> element which specify a term",
            "Used in conjunction with the <dl> element which specify a term’s definition",
            "How many types of list are there in HTML?"},
            //6
            {"Which among the following is correct HTML code for making a checkbox?",
            "What is the correct HTML for making a text input field?",
            "Which tag is used for creating a drop-down selection list?",
            "What is the correct HTML for making a text area?",
            "Which HTML code will display a radio button?",
            "Which input type allows multiple options to be selected?",
            "To create a password field on a form, which code below would define a password field?",
            "You can group logically related controls and labels within a web form using the <legend> element",
            "This button is used to send the form data to a web server",
            "This button resets all the forms control to default values"},
            //7
            {"Iframe is also known as",
            "The content inside an iframe exists entirely independent from the surrounding elements.",
            "What is the basic syntax for adding an iframe to a web page",
            "The width and height attribute values are specified in percentage by default,",
            "What is the default width of an iframe?",
            "What is the default height of an iframe?",
            "What tag specifies an inline iframe?",
            "Removes the border around the iframe",
            "The src attribute defines the URL of the page to embed",
            "The length and width attributes specifies the size of the iframe"}
        },
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
            //2
            {"What is the correct HTML for creating a hyperlink?",
            "What do you call a link that is underlined and blue?",
            "What do you call a link that is underlined and purple?",
            "What do you call a link that is underlined and red?",
            "This target attribute opens the document in the same window/tab as it was clicked",
            "This target attribute opens the document in a new windows or tab",
            "This target attribute opens the document in the parent frame",
            "This target attribute opens the document in the full body of the window",
            "Images cannot be links",
            "A local link (a link to a page within the same website) without the \"https://www\" part"},
            //3--
            {"What is the correct HTML for inserting an image?",
            "For specifying the height and width of an image which attribute is used in image tag?",
            "Which of the following is NOT included in the IMAGE tag code?",
            "Which of the following is included in the image tag code?",
            "Which tag should be used to include the following image: cat.jpeg?",
            "What is missing from this image tag <img=\"cat.jpeg\" alt=\"cat\"/>?",
            "What is missing from the following image tag? <img src = cat.jpeg alt = cat jumping / >",
            "Which is an example of a complete image tag?",
            "What is missing from the following image tag? <img src =\"\" alt =\"Cat Jumping\"/>",
            "What is missing from the following image tag? <img src = \"cat.jpeg\" alt = \"cat jumping\"/>"},
            //4
            {"Which of these elements are all <table> elements?",
            "Which tag is used to add a header in HTML5 table?",
            "Starting tag of a table",
            "A <tr> element can have 0 <td> elements inside",
            "To add rows to your tables use which tags?",
            "To create columns inside a row you can use what elements?",
            "You can define a cell as a header for a group of table cells using what element?",
            "You can use what attribute to create a cell that spans more than one row?",
            "ou can specify a caption (or title) for your tables using what element?",
            "Which is the correct way of defining a table footer?"}         
        },
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
            //2
            {"What is the correct HTML for creating a hyperlink?",
            "What do you call a link that is underlined and blue?",
            "What do you call a link that is underlined and purple?",
            "What do you call a link that is underlined and red?",
            "This target attribute opens the document in the same window/tab as it was clicked",
            "This target attribute opens the document in a new windows or tab",
            "This target attribute opens the document in the parent frame",
            "This target attribute opens the document in the full body of the window",
            "Images cannot be links",
            "A local link (a link to a page within the same website) without the \"https://www\" part"},
            //3--
            {"What is the correct HTML for inserting an image?",
            "For specifying the height and width of an image which attribute is used in image tag?",
            "Which of the following is NOT included in the IMAGE tag code?",
            "Which of the following is included in the image tag code?",
            "Which tag should be used to include the following image: cat.jpeg?",
            "What is missing from this image tag <img=\"cat.jpeg\" alt=\"cat\"/>?",
            "What is missing from the following image tag? <img src = cat.jpeg alt = cat jumping / >",
            "Which is an example of a complete image tag?",
            "What is missing from the following image tag? <img src =\"\" alt =\"Cat Jumping\"/>",
            "What is missing from the following image tag? <img src = \"cat.jpeg\" alt = \"cat jumping\"/>"},
            //4
            {"Which of these elements are all <table> elements?",
            "Which tag is used to add a header in HTML5 table?",
            "Starting tag of a table",
            "A <tr> element can have 0 <td> elements inside",
            "To add rows to your tables use which tags?",
            "To create columns inside a row you can use what elements?",
            "You can define a cell as a header for a group of table cells using what element?",
            "You can use what attribute to create a cell that spans more than one row?",
            "ou can specify a caption (or title) for your tables using what element?",
            "Which is the correct way of defining a table footer?"}          
        },
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
            //2
            {"What is the correct HTML for creating a hyperlink?",
            "What do you call a link that is underlined and blue?",
            "What do you call a link that is underlined and purple?",
            "What do you call a link that is underlined and red?",
            "This target attribute opens the document in the same window/tab as it was clicked",
            "This target attribute opens the document in a new windows or tab",
            "This target attribute opens the document in the parent frame",
            "This target attribute opens the document in the full body of the window",
            "Images cannot be links",
            "A local link (a link to a page within the same website) without the \"https://www\" part"},
            //3--
            {"What is the correct HTML for inserting an image?",
            "For specifying the height and width of an image which attribute is used in image tag?",
            "Which of the following is NOT included in the IMAGE tag code?",
            "Which of the following is included in the image tag code?",
            "Which tag should be used to include the following image: cat.jpeg?",
            "What is missing from this image tag <img=\"cat.jpeg\" alt=\"cat\"/>?",
            "What is missing from the following image tag? <img src = cat.jpeg alt = cat jumping / >",
            "Which is an example of a complete image tag?",
            "What is missing from the following image tag? <img src =\"\" alt =\"Cat Jumping\"/>",
            "What is missing from the following image tag? <img src = \"cat.jpeg\" alt = \"cat jumping\"/>"},
                
        }   
    };

    String[][][][] Answer = {
        {
                            { //1
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
                            }}, //2
                            {
                                {"A. <a href = http://www.html.com> HTML</a>",
                                 "B. <a link = http://www.html.com> HTML</a>",
                                 "C. <a> http://www.html.com> HTML</a>",
                                 "D. <a hyperlink = http://www.html.com> HTML</a>"                             
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                           
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. self",
                                 "B. blank",
                                 "C. parent",
                                 "D. top"                         
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _parent",
                                 "D. _self"                      
                            },
                                {"A. top",
                                 "B. self",
                                 "C. parent",
                                 "D. blank"                             
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _self",
                                 "D. _parent"                         
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                             
                            },
                                {"A. Absolute URL",
                                 "B. Relative URL",
                                 "C. Hyprelink",
                                 "D. Visited link"                           
                            }}, // 3
                            {
                                {"A. <img>image.gif</img>",
                                 "B. <img alt = “image.gif”>Image</img>",
                                 "C. <image src = “image.gif” alt = “Image”>",
                                 "D. <img src = “image.gif” alt = “Image”>"                           
                            },
                                {"A. Style tag",
                                 "B. Alt attribute",
                                 "C. Target attribute",
                                 "D. None of the above"                          
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                            
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                                
                            },
                                {"A. <img src=\"cats.jpg\" alt=\"cat\"/>",
                                 "B. <img src=\"cat.JPG\" alt=\"cat\"/>",
                                 "C. <img src=\"cat.jpeg\" alt=\"cat\"/>",
                                 "D. <img src=\"dog.jpeg\" alt=\"cat\"/>"                        
                            },
                                {"A. h1",
                                 "B. h6",
                                 "C. .jpeg",
                                 "D. src="                    
                            },
                                {"A. Closing Tag",
                                 "B. Nothing",
                                 "C. Quotation Marks",
                                 "D. Parenthesis"                           
                            },
                                {"A. <img \"dog.jpg\">",
                                 "B. <img src=\"dog.jpg\" alt=\"my dog\"/>",
                                 "C. <img=dog.jpg",
                                 "D. <src=\"dog.jpg\" alt=\"my dog\">"                        
                            },
                                {"A. Quotation Marks",
                                 "B. An image",
                                 "C. Closing Tag",
                                 "D. Nothing"                          
                            },
                                {"A. Nothing",
                                 "B. Quotation Marks",
                                 "C. Angle Brackets",
                                 "D. Closing Tag"                          
                            }},//4
                            {
                                {"A. <table> <tr> <td>",
                                 "B. <table> <row> <column>",
                                 "C. <table> <tr> <td>",
                                 "D. <table> <th> <tf>"                           
                            },
                                {"A. <th>",
                                 "B. <header>",
                                 "C. <theader>",
                                 "D. <tableheader>"                        
                            },
                                {"A. <tr>",
                                 "B. <table>",
                                 "C. <td>",
                                 "D. <tablet>"                           
                            },
                                {"A. Yes",
                                 "B. No",
                                 "C. None of the Above",
                                 "D. Neither Yes or No"                                  
                            },
                                {"A. <cr> and </cr>",
                                 "B. <tr> and </tr>",
                                 "C. <td> and </td>",
                                 "D. <th> and </th>"                       
                            },
                                {"A. <tr>",
                                 "B. <td>",
                                 "C. <th>",
                                 "D. <table>"                    
                            },
                                {"A. <tr>",
                                 "B. <td>",
                                 "C. <th>",
                                 "D. <table>"                           
                            },
                                {"A. Colspan",
                                 "B. Spanning",
                                 "C. Rowspan",
                                 "D. Rowcolspan"                        
                            },
                                {"A. <caption>",
                                 "B. <comment>",
                                 "C. <title>",
                                 "D. <table comment>"                         
                            },
                                {"A. <foot>",
                                 "B. <footer>",
                                 "C. <tfoot>",
                                 "D. <table footer>"                          
                            }}, //5
                            {
                                {"A. <ul>",
                                 "B. <li>",
                                 "C. <ol>",
                                 "D. <un>"                          
                            },
                                {"A. <ol>",
                                 "B. <nl>",
                                 "C. <ul>",
                                 "D. <li>"                          
                            },
                                {"A. ordered list",
                                 "B. unordered list",
                                 "C. paragraph",
                                 "D. heading"                            
                            },
                                {"A. ordered list",
                                 "B. unordered list",
                                 "C. paragraph",
                                 "D. heading"                                
                            },
                                {"A. <li>item</li>",
                                 "B. <ol>item</ol>",
                                 "C. <li />item",
                                 "D. <ul>item</ul>"                        
                            },
                                {"A. Unordered list",
                                 "B. Ordered list",
                                 "C. Description list",
                                 "D. List name"                   
                            },
                                {"A. <dl>",
                                 "B. <dt>",
                                 "C. <dd>",
                                 "D. <dlt>"                           
                            },
                                {"A. <dl>",
                                 "B. <dt>",
                                 "C. <dd>",
                                 "D. <dlt>"                        
                            },
                                {"A. <dl>",
                                 "B. <dt>",
                                 "C. <dd>",
                                 "D. <dtd>"                         
                            },
                                {"A. 1",
                                 "B. 2",
                                 "C. 3",
                                 "D. 4"                          
                            }}, //6
                            {
                                {"A. <checkbox>",
                                 "B. <input type = “checkbox”>",
                                 "C. <input = “checkbox”>",
                                 "D. <input form = “checkbox”>"                           
                            },
                                {"A. <textfield>",
                                 "B. <textinput type=\"text\" >",
                                 "C. <input type=\"textfield\" >",
                                 "D. <input type=\"text\" >"                        
                            },
                                {"A. <select>",
                                 "B. <dropdown>",
                                 "C. <option>",
                                 "D. <list>"                            
                            },
                                {"A. <input type = “textarea”>",
                                 "B. <textarea>",
                                 "C. <input form = “textarea>",
                                 "D. <ta>"                               
                            },
                                {"A. <radio>",
                                 "B. <input type=\"radiobutton\">",
                                 "C. <radiobutton>",
                                 "D. <input type=\"radio\">"                        
                            },
                                {"A. Textbox",
                                 "B. Textarea",
                                 "C. Checkbox",
                                 "D. Radio"                    
                            },
                                {"A. <text type=\"password\">",
                                 "B. <input type=\"password\">",
                                 "C. <password>",
                                 "D. <input type=\"password field\">"                           
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                         
                            },
                                {"A. Reset button",
                                 "B. Submit button",
                                 "C. Send button",
                                 "D. Restart button"                          
                            },
                                {"A. Reset button",
                                 "B. Submit button",
                                 "C. Send button",
                                 "D. Restart button"                         
                            }}, //7
                            {
                                {"A. Independent frame",
                                 "B. Inline frame",
                                 "C. Inside frame",
                                 "D. Index frame"                           
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                         
                            },
                                {"A. <iframe = “URL”></iframe>",
                                 "B. <inline frame = “URL”></inline frame>",
                                 "C. <iframe src = “URL”></iframe>",
                                 "D. <iframe src = “URL” alt = “description”></iframe>"                           
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                               
                            },
                                {"A. 100",
                                 "B. 200",
                                 "C. 300",
                                 "D. 400"                        
                            },
                                {"A. 150",
                                 "B. 250",
                                 "C. 350",
                                 "D. 450"                    
                            },
                                {"A. <iframe>",
                                 "B. <frame>",
                                 "C. <inline frame>",
                                 "D. <inframe>"                           
                            },
                                {"A. Border: nonexistent",
                                 "B. Border:cancel",
                                 "C. Border: remove",
                                 "D. Border: none"                      
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                         
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                         
                            }}                            
        },
        {
                            { //1
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
                            }}, //2
                            {
                                {"A. <a href = http://www.html.com> HTML</a>",
                                 "B. <a link = http://www.html.com> HTML</a>",
                                 "C. <a> http://www.html.com> HTML</a>",
                                 "D. <a hyperlink = http://www.html.com> HTML</a>"                             
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                           
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. self",
                                 "B. blank",
                                 "C. parent",
                                 "D. top"                         
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _parent",
                                 "D. _self"                      
                            },
                                {"A. top",
                                 "B. self",
                                 "C. parent",
                                 "D. blank"                             
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _self",
                                 "D. _parent"                         
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                             
                            },
                                {"A. Absolute URL",
                                 "B. Relative URL",
                                 "C. Hyprelink",
                                 "D. Visited link"                           
                            }}, // 3
                            {
                                {"A. <img>image.gif</img>",
                                 "B. <img alt = “image.gif”>Image</img>",
                                 "C. <image src = “image.gif” alt = “Image”>",
                                 "D. <img src = “image.gif” alt = “Image”>"                           
                            },
                                {"A. Style tag",
                                 "B. Alt attribute",
                                 "C. Target attribute",
                                 "D. None of the above"                          
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                            
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                                
                            },
                                {"A. <img src=\"cats.jpg\" alt=\"cat\"/>",
                                 "B. <img src=\"cat.JPG\" alt=\"cat\"/>",
                                 "C. <img src=\"cat.jpeg\" alt=\"cat\"/>",
                                 "D. <img src=\"dog.jpeg\" alt=\"cat\"/>"                        
                            },
                                {"A. h1",
                                 "B. h6",
                                 "C. .jpeg",
                                 "D. src="                    
                            },
                                {"A. Closing Tag",
                                 "B. Nothing",
                                 "C. Quotation Marks",
                                 "D. Parenthesis"                           
                            },
                                {"A. <img \"dog.jpg\">",
                                 "B. <img src=\"dog.jpg\" alt=\"my dog\"/>",
                                 "C. <img=dog.jpg",
                                 "D. <src=\"dog.jpg\" alt=\"my dog\">"                        
                            },
                                {"A. Quotation Marks",
                                 "B. An image",
                                 "C. Closing Tag",
                                 "D. Nothing"                          
                            },
                                {"A. Nothing",
                                 "B. Quotation Marks",
                                 "C. Angle Brackets",
                                 "D. Closing Tag"                          
                            }},//4
                            {
                                {"A. <table> <tr> <td>",
                                 "B. <table> <row> <column>",
                                 "C. <table> <tr> <td>",
                                 "D. <table> <th> <tf>"                           
                            },
                                {"A. <th>",
                                 "B. <header>",
                                 "C. <theader>",
                                 "D. <tableheader>"                        
                            },
                                {"A. <tr>",
                                 "B. <table>",
                                 "C. <td>",
                                 "D. <tablet>"                           
                            },
                                {"A. Yes",
                                 "B. No",
                                 "C. None of the Above",
                                 "D. Neither Yes or No"                                  
                            },
                                {"A. <cr> and </cr>",
                                 "B. <tr> and </tr>",
                                 "C. <td> and </td>",
                                 "D. <th> and </th>"                       
                            },
                                {"A. <tr>",
                                 "B. <td>",
                                 "C. <th>",
                                 "D. <table>"                    
                            },
                                {"A. <tr>",
                                 "B. <td>",
                                 "C. <th>",
                                 "D. <table>"                           
                            },
                                {"A. Colspan",
                                 "B. Spanning",
                                 "C. Rowspan",
                                 "D. Rowcolspan"                        
                            },
                                {"A. <caption>",
                                 "B. <comment>",
                                 "C. <title>",
                                 "D. <table comment>"                         
                            },
                                {"A. <foot>",
                                 "B. <footer>",
                                 "C. <tfoot>",
                                 "D. <table footer>"                          
                            }}                            
        },
                {
                            { //1
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
                            }}, //2
                            {
                                {"A. <a href = http://www.html.com> HTML</a>",
                                 "B. <a link = http://www.html.com> HTML</a>",
                                 "C. <a> http://www.html.com> HTML</a>",
                                 "D. <a hyperlink = http://www.html.com> HTML</a>"                             
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                           
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. self",
                                 "B. blank",
                                 "C. parent",
                                 "D. top"                         
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _parent",
                                 "D. _self"                      
                            },
                                {"A. top",
                                 "B. self",
                                 "C. parent",
                                 "D. blank"                             
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _self",
                                 "D. _parent"                         
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                             
                            },
                                {"A. Absolute URL",
                                 "B. Relative URL",
                                 "C. Hyprelink",
                                 "D. Visited link"                           
                            }}, // 3
                            {
                                {"A. <img>image.gif</img>",
                                 "B. <img alt = “image.gif”>Image</img>",
                                 "C. <image src = “image.gif” alt = “Image”>",
                                 "D. <img src = “image.gif” alt = “Image”>"                           
                            },
                                {"A. Style tag",
                                 "B. Alt attribute",
                                 "C. Target attribute",
                                 "D. None of the above"                          
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                            
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                                
                            },
                                {"A. <img src=\"cats.jpg\" alt=\"cat\"/>",
                                 "B. <img src=\"cat.JPG\" alt=\"cat\"/>",
                                 "C. <img src=\"cat.jpeg\" alt=\"cat\"/>",
                                 "D. <img src=\"dog.jpeg\" alt=\"cat\"/>"                        
                            },
                                {"A. h1",
                                 "B. h6",
                                 "C. .jpeg",
                                 "D. src="                    
                            },
                                {"A. Closing Tag",
                                 "B. Nothing",
                                 "C. Quotation Marks",
                                 "D. Parenthesis"                           
                            },
                                {"A. <img \"dog.jpg\">",
                                 "B. <img src=\"dog.jpg\" alt=\"my dog\"/>",
                                 "C. <img=dog.jpg",
                                 "D. <src=\"dog.jpg\" alt=\"my dog\">"                        
                            },
                                {"A. Quotation Marks",
                                 "B. An image",
                                 "C. Closing Tag",
                                 "D. Nothing"                          
                            },
                                {"A. Nothing",
                                 "B. Quotation Marks",
                                 "C. Angle Brackets",
                                 "D. Closing Tag"                          
                            }},//4
                            {
                                {"A. <table> <tr> <td>",
                                 "B. <table> <row> <column>",
                                 "C. <table> <tr> <td>",
                                 "D. <table> <th> <tf>"                           
                            },
                                {"A. <th>",
                                 "B. <header>",
                                 "C. <theader>",
                                 "D. <tableheader>"                        
                            },
                                {"A. <tr>",
                                 "B. <table>",
                                 "C. <td>",
                                 "D. <tablet>"                           
                            },
                                {"A. Yes",
                                 "B. No",
                                 "C. None of the Above",
                                 "D. Neither Yes or No"                                  
                            },
                                {"A. <cr> and </cr>",
                                 "B. <tr> and </tr>",
                                 "C. <td> and </td>",
                                 "D. <th> and </th>"                       
                            },
                                {"A. <tr>",
                                 "B. <td>",
                                 "C. <th>",
                                 "D. <table>"                    
                            },
                                {"A. <tr>",
                                 "B. <td>",
                                 "C. <th>",
                                 "D. <table>"                           
                            },
                                {"A. Colspan",
                                 "B. Spanning",
                                 "C. Rowspan",
                                 "D. Rowcolspan"                        
                            },
                                {"A. <caption>",
                                 "B. <comment>",
                                 "C. <title>",
                                 "D. <table comment>"                         
                            },
                                {"A. <foot>",
                                 "B. <footer>",
                                 "C. <tfoot>",
                                 "D. <table footer>"                          
                            }}                           
        },
                        {
                            { //1
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
                            }}, //2
                            {
                                {"A. <a href = http://www.html.com> HTML</a>",
                                 "B. <a link = http://www.html.com> HTML</a>",
                                 "C. <a> http://www.html.com> HTML</a>",
                                 "D. <a hyperlink = http://www.html.com> HTML</a>"                             
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                           
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. Unvisited link",
                                 "B. Visited link",
                                 "C. Active link",
                                 "D. Hyperlink"                               
                            },
                                {"A. self",
                                 "B. blank",
                                 "C. parent",
                                 "D. top"                         
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _parent",
                                 "D. _self"                      
                            },
                                {"A. top",
                                 "B. self",
                                 "C. parent",
                                 "D. blank"                             
                            },
                                {"A. _blank",
                                 "B. _top",
                                 "C. _self",
                                 "D. _parent"                         
                            },
                                {"A. True",
                                 "B. False",
                                 "C. None of the Above",
                                 "D. Not True and Not False"                             
                            },
                                {"A. Absolute URL",
                                 "B. Relative URL",
                                 "C. Hyprelink",
                                 "D. Visited link"                           
                            }}, // 3
                            {
                                {"A. <img>image.gif</img>",
                                 "B. <img alt = “image.gif”>Image</img>",
                                 "C. <image src = “image.gif” alt = “Image”>",
                                 "D. <img src = “image.gif” alt = “Image”>"                           
                            },
                                {"A. Style tag",
                                 "B. Alt attribute",
                                 "C. Target attribute",
                                 "D. None of the above"                          
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                            
                            },
                                {"A. Img",
                                 "B. Src",
                                 "C. H1",
                                 "D. Alt"                                
                            },
                                {"A. <img src=\"cats.jpg\" alt=\"cat\"/>",
                                 "B. <img src=\"cat.JPG\" alt=\"cat\"/>",
                                 "C. <img src=\"cat.jpeg\" alt=\"cat\"/>",
                                 "D. <img src=\"dog.jpeg\" alt=\"cat\"/>"                        
                            },
                                {"A. h1",
                                 "B. h6",
                                 "C. .jpeg",
                                 "D. src="                    
                            },
                                {"A. Closing Tag",
                                 "B. Nothing",
                                 "C. Quotation Marks",
                                 "D. Parenthesis"                           
                            },
                                {"A. <img \"dog.jpg\">",
                                 "B. <img src=\"dog.jpg\" alt=\"my dog\"/>",
                                 "C. <img=dog.jpg",
                                 "D. <src=\"dog.jpg\" alt=\"my dog\">"                        
                            },
                                {"A. Quotation Marks",
                                 "B. An image",
                                 "C. Closing Tag",
                                 "D. Nothing"                          
                            },
                                {"A. Nothing",
                                 "B. Quotation Marks",
                                 "C. Angle Brackets",
                                 "D. Closing Tag"                          
                            }}                      
        }
    };
    String[][][] Correct = {
                        {
                            {"C","D","A","D","C","B","C","D","A","B"}, 
                            {"A","A","B","C","A","A","C","B","B","B"}, 
                            {"D","A","C","A","C","D","C","B","B","A"}, 
                            {"C","A","B","B","B","B","B","C","A","C"}, 
                            {"A","A","B","A","A","C","A","B","C","C"}, 
                            {"B","D","C","B","D","C","B","A","B","A"}, 
                            {"B","A","C","B","C","A","A","D","A","B"} 
                        },
                        {
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"}
                        },
                        {
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"}
                        },
                        {
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"},
                            {"B","D","C","B","D","C","B","A","B","A"}
                        },
                            };
    
    String[] instructorNote = {"Welcome to the HTML pathway! So you’ve decided you want to learn some HTML? Well, you have come to the right place! Learning HTML is something every web developer should learn. After all, HTML is the basic skeleton of all web pages. Without HTML skills, web developers wouldn’t be able to add text, add images, or even add videos to your favorite websites. HTML is the very foundation of everything you need to know in order to create an engaging web page!\n" +
"\n" +
"In this pathway, you will learn all the common HTML tags used to structure HTML pages. You will also learn how to add links and images to your web pages. Plus, some basics on how to create HTML tables, forms, lists, and iFrames.\n" +
"\n" +
"If ever you encountered some issues, have inquiries or suggestions, please do not hesitate to get in touch with our support team in the contact us section. We would love to hear from you!\n" +
"\n" +
"What website do you wish existed but doesn't yet? Whatever that may be, hopefully, by the end of this pathway, you will be able to create your very own web page! Goodluck on starting your HTML journey and continue building your imagination! " ,
        "Hey there learner! In this pathway, you’re going to learn the basics of CSS. So what is CSS anyway? Well, Cascading Style Sheets or CSS is a style sheet language used for describing the presentation of a document written in a markup language such as HTML. In simple terms, CSS is what gives life to the websites you visit on the internet. In this pathway, you’re going to learn how to turn your plain old boring HTML document into a modern looking website! So sit back, relax and get ready to code! \n" +
"\n" +
"Before you enroll, please make sure that you have enough knowledge about HTML. If you don’t know what HTML is, I highly recommend you to finish the HTML pathway first before enrolling in this course.\n" +
"\n" +
"If you have any concerns regarding your CSS journey, please do not hesitate to contact the developers of the app. Goodluck learner!", 
    "Welcome to JavaScript! Your pathway in learning the fundamentals of JavaScript web programming language. Here, you will begin learning the basic concepts revolving around JavaScript. After every week worth of lessons, there will be a Quiz provided for assessment and evaluation.  \n" +
"\n" +
"At the end of this lesson, we expect you to build a strong foundation about the fundamentals of JavaScript, synthesize basic concepts revolving around JavaScript, and deal with problems relating to JavaScript. \n" +
"\n" +
"If you feel that you are somewhat experiencing issues as you move across the lesson, feel free to address your concern in the contact us section. \n" +
"\n" +
"Good luck as you start with this lesson and remember to do it at your own pace.", 
    "Welcome to the SQL pathway! So you’ve decided you want to learn SQL? Well, you have come to the right place! Learning SQL is something every web developer should learn. After all, SQL is one of the database of what you want to put online or offline. Without knowledge in SQL, web developers wouldn’t be able to store all of the important files they needed saving and can't retrieve it with one touch . SQL is one of the important things you need to know so that you can keep track and update everything revolving your webpage.\n" +
"\n" +
"In this pathway, you will learn the basics of Structured Query Language. Starting with the Data types, Constraints, Sequences, and lastly Student Database.\n" +
"\n" +
"Want to update your tracks on your businesses on your notebook to a more secure and fast database?, hopefully, by the end of this pathway, you will be able to know the basics in creating a database! Goodluck on starting your SQL journey and continue keepsafing your informations!\n" +
"\n" +
"If ever you encountered some issues, have inquiries or suggestions, please do not hesitate to get in touch with our support team in the contact us section. We would love to hear from you!"};
    public String[][] arrayPDFStorage(){
        return pdfStorage;
    }
    public String[][][] arrayQuestionStorage() {
        return Question;
    }
    public String[][] currentWeek(){
        return pathWeek;
    }
    public String[][] getsideColor(){
        return sideColor;
    }
    public String[][] getmainTab(){
        return mainTab;
    }
    public String[][][] arrayCorrect(){
        return Correct;
    }
    public String[][][][] arrayAnswer(){
        return Answer;
    }
    public String[] getInstructorNote(){
        return instructorNote;
    }
}


