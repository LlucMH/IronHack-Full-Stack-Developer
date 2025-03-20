# PROJECT

## Learning outcomes

By the end of this lesson, you will be able to:

- Build a responsive website using HTML, CSS & JavaScript
- Use different layout properties like Flexbox and positioning when needed
- Deploy a live website to Netlify using Git

## Introduction to the Project 1

In this project, you’re going to be building and deploying your first fully responsive website using the technologies you’ve learned so far: HTML, CSS & JavaScript.

## Technical Requirements

For this project, you’ll have to recreate a pre-existing design using your HTML & CSS skills. You’ll also have to create a few interactions with the DOM, using what you’ve learned about JavaScript so far.

Finally, you’ll have to deploy this project to Netlify, using the Git CLI to do so. When you’re finished, you’ll have your first website live and ready for anyone to interact with it!

At a minimum, you should meet the following technical requirements:

- Your website should be rendered in a browser
- Include separate HTML / CSS / JavaScript files
- Have a repo on GitHub
- Have at least 1 commit per day that you worked on it
- Be deployed online using Netlify so that anybody can access it
- Stick with KISS (Keep It Simple Stupid) and DRY (Don’t Repeat Yourself) principles
- Replicate the pages where the design files have been supplied using HTML and CSS
- Ensure your website is responsive
- Implement any functionality on your website using JavaScript
- Create a README file that covers all of the application’s features, configuration and specifications
- **BONUS:** For extra credits, add some additional functionality to your website beyond the scope of this brief. e.g. a working 404 page

## Tips for success 🚀

- Be careful not to duplicate your code in any other language. E.g. if you create functionality in JavaScript, don’t duplicate this in HTML/CSS
- Write clean, modular and efficient code following best practices
- Name your folders and files clearly and consistently
- Apply indentation conventions to your source code and name your functions and variables logically
- Remove any unused code from your source code
- Use separate git branches for development and deployment

## Deliverables

- The URL of the GitHub repository for your project
- The URL of the live website on the Internet
- The URL of the slides for your project presentation
- You must present your project during the Project 1 presentations

## Project assets

For this project, you’ll have access to the following assets:

- A [Figma](https://www.figma.com/) design that you will have to turn into a live, responsive website. This design also includes a few specifications regarding fonts and colors
- A folder with all the images you will need for this project.

You can download all assets from the following [project assets Google Drive folder](https://drive.google.com/drive/folders/1s48zMkVPVFViY2Go1H6_4prQ3sAS--FV?usp=sharing).

## Project description

You’ll be building a website for a fictional web design company. This includes a few pages:

- A home page
- A project page and
- A contact page with a form.

Some of the challenges you’ll have to complete will be the following:

- Adding navigation between the pages
- Making all the fields in the contact form required before being able to submit it
- **(Bonus)** Adding animations to different sections, like the “recent projects” cards

## JavaScript functionality

You’ll need to use JavaScript to implement some of the functionality on the website. Here are some basic instructions:

- Using [this endpoint](https://raw.githubusercontent.com/ironhack-jc/mid-term-api/main/projects), fetch the first three projects of the API to display on the website in the expected position. This API returns the projects in descending order, so you can assume the first item of the array is the last project.

- Create a folder named `projects` with a file named `1.html` inside.
- Inside this file, you should fetch the API using the `onload` event. Use [MDN - Window: load event](https://developer.mozilla.org/en-US/docs/Web/API/Window/load_event) if you need help.
- Filter the project with `uuid 1` and print the name, description, content, image and `completed_on` in the expected position of the page.
- Other projects should be other projects of the API. For example, if you are filtering the project with `uuid 1`, other projects must be others.

- **BONUS:** Take three other projects randomly. If the project does not exist in the API, you should alert the user.

- Validate the form using JavaScript (in addition to the required and type of the input) by showing an alert if the name is equal to "ironhack". E.g. “You cannot be Ironhack, because I am Ironhack.” In addition, you can create more filters such as incorrect email, required fields not set, etc.

You can refer to [W3 Schools - JS Validation](https://www.w3schools.com/js/js_validation.asp) for help with this.

- **BONUS:** Create a responsive menu. When clicked, toggle the menu.

## Setup

Besides your usual IDE, you will need to create a Figma account in order to open up the design that you’re going to replicate. Creating an account is completely free.

We recommend you download the desktop Figma app for this project. Once you’ve created your account and downloaded the software, you just need to [import the `.fig` file](https://help.figma.com/hc/en-us/articles/360041003114-Import-files-into-Figma) you’ll see inside the Assets folder and you’ll be set.

To review the basics of Figma, you can watch this [introductory video](https://www.youtube.com/).

### Quick summary on how to use Figma
During a real-world web development project, most of the time you’ll have to use the design file you get in order to build a website. Here are some of the tasks you’ll have to do in most of your projects:

- Export the assets you’re going to use.
- Review styles (sizes, margins, fonts, colors, etc.).

Before starting the project, you should review the basics of Figma just so you know exactly how to use it in order to create your first responsive website.

## Web responsiveness

As is the case with most professional projects, for this task you’ve received a design prepared for a desktop screen. However, as you know by now, you always need to keep mobile devices in mind.

One of the main challenges of this project is to adapt the existing design to all screen sizes. **You are free to modify any aspect of the website as you see fit in order to make it compatible with mobile devices.**

## Deployment

The last task of this project is to actually deploy your website once it’s completed. For this particular project, we’ll be using **Netlify**, a static web page hosting service.

Deploying to Netlify is pretty simple: you just need to create an account, connect it to your GitHub repository, enter a few commands in your CLI and you’re good to go.

[Here’s a guide](https://www.netlify.com/blog/2016/10/27/a-step-by-step-guide-deploying-a-static-site-or-single-page-app/) showing you how to deploy a static website using this service that you can follow once your project is completed.

## Rubrics

In order to assess your project and ensure all requirements are met, a **rubric** will be used. This rubric is used to **evaluate your project** by your teaching staff but also to **communicate** what constitutes incomplete, acceptable and excellent performance across each of the learning outcomes for this project. Take some time to review the rubric and ask your lead teacher any questions about it if necessary.

| Learning outcomes | Domains | 0 - Incomplete | 1 - Fair | 2 - Good | 3 - Excellent |
|--------------------|-----------|----------------|-----------|-----------|--------------|
| **Create the Home Page following provided designs** | Client-side development | Student failed to create the page. | Student partially created the Home Page. Some components are missing or are poorly implemented. | Student created the whole Home Page with all components following provided designs. | Student created the whole Home Page with all components following provided designs. Student used the anchor to link the menu with the content of home page and to link to the Contact Page and the Project page. Student followed the same structure of the whole application. |
| **Create the Project Page following provided designs** | Client-side development | Student failed to create the three pages with components in each one. | Student partially created the Project Page. Some components are missing or are poorly implemented. | Student created the whole Project Page with all components following provided designs. | Student created the whole Project Page with all components following provided designs. Student added anchors to other pages. Student followed the same structure of the whole application. |
| **Create the Contact Page following provided designs** | Client-side development | Student failed to create the three pages with components in each one. | Student partially created the Contact Page. Some components are missing or are poorly implemented. | Student created the whole Project Page with all components following provided designs. | Student created the whole Contact Page with all components following provided designs. The form has the correct type of input and the required ones match the design. Student added anchors to other pages. Student followed the same structure of the whole application. Student distinguishes the difference between ID and the class. |
| **Style the application’s UI using CSS or a CSS Framework** | Client-side development | Student used basic layouts without CSS styles or branding. | Student partially styled the application using CSS and simple branding. | Student adequately styled the whole application using CSS or a CSS framework. Student made an obvious effort to create a pleasant and appealing user interface and maintain consistent application branding. | Student adequately styled the whole application using CSS or a CSS framework. Student made an obvious effort to create a pleasant and appealing user interface and maintain consistent application branding. Student added animations. |
| **Create responsive pages** | Client-side development | Student did not make any attempt to make the application responsive. | Student partially made some parts of the application responsive. | Student adequately made the whole application responsive using media queries or flex. | Student adequately made the whole application responsive using media queries or flex. Student followed the Mobile First principle. Student made an obvious effort to create a pleasant and appealing user interface and maintain consistent application branding. |
| **Handle asynchronous operations using Promises or Async/await** | Intermediate JavaScript, Advanced JavaScript | Student does not appear to possess a basic understanding of the promises and callback handling. The handling of the existing promises in the code is incomplete or non-functional. | Student handled resolved promises appropriately. Student only partially implemented or missed implementing catch blocks for some promises. Student had difficulty chaining promises together. | Student adequately handled all resolved and rejected promises and appropriately chained promises to execute asynchronous tasks in sequence. Nearly all promises have catch blocks with adequate error handling. | Student successfully handled all resolved and rejected promises and appropriately chained promises to execute asynchronous tasks in sequence. All promises have catch blocks with adequate error handling. Student successfully used advanced promise methods to coordinate the execution of multiple asynchronous operations. |
| **Manage the array of projects** | Intermediate JavaScript, Advanced JavaScript | Student does not appear to possess a basic understanding of arrays. The handling of the existing arrays in the code is incomplete or non-functional. | Student filtered and sorted the array of projects using for/forEach/while or other non-array functions. Student only partially implemented or missed implementing the filter/sort array function. Student had difficulty chaining array functions together. | Student adequately filtered and sorted the array of projects using array functions. Although the logic of the filter callback works, it is vague or very complex. Nearly all array functions are chained together. | Student adequately filtered the array of projects using array functions. The logic of the filter callback is concise. All array functions are chained together. |
| **Generate content dynamically** | Intermediate JavaScript, Advanced JavaScript | Student does not appear to possess a basic understanding of DOM manipulation. | Student created content dynamically using the “createElement” function. Student repeated the code many times and did not create auxiliary functions in order to keep the code DRY. | Student created content dynamically using the “createElement” function or injecting code in the innerHTML of an existing element. Student use auxiliary functions in order to not repeat the code and used template strings. If student used the injecting code strategy, they did not use template strings. | Student created content dynamically using the “createElement” function or injecting code in the innerHTML of an existing element. Student use auxiliary functions in order to not repeat the code and if student used the injecting code strategy, they used template strings. |
| **Add JS functionalities** | Intermediate JavaScript, Advanced JavaScript | Student did not add any JS functionality. | Student used JavaScript to toggle menu visibility in response view. | Student used JavaScript to toggle menu visibility in response view. Student manage to validate the input of the form and error messages with JS. | Student used JavaScript to toggle menu visibility in response view. Student manage to validate the input of the form and error messages with JS. Student used basic JS functions to improve UX: alert, redirect, toggle spinner when loading, etc. |
| **Write clean, modular, and efficient code following best practices** | Code Quality | Student has not followed best practices in writing clean, modular and efficient code. Student has unused code in the project and functions that are considered too large or perform multiple tasks. Student has not followed a consistent approach in naming structure and organization of the files/folder. Student has not applied indentation conventions making the code hard to read. | Student has named files and folders for the frontend logically and has organized them clearly and consistently. Student has partially applied indentation conventions to the source code and has mostly named functions and variables logically. Some unused code is within the projects. | Student has adequately named files and folders for the frontend and has organized them clearly and consistently. Student has also applied indentation conventions to the source code and has named functions and variables logically. Student used advanced approaches to extract values from complex data structures to enhance code readability. There is no unused code within the project and utility functions are contained in separate self-descriptive files. | Student has adequately named all files and folders for the frontend and has organized them clearly and consistently. Student has applied indentation conventions to the source code and was meticulous in commenting the code. Student has named functions and variables logically following the industry conventions. There is no unused code within the project and utility functions are contained in separate self-descriptive files. Student used destructuring, rest parameters and/or other ES+ features to enhance code readability. Student abstracted part of the application login into services. |
| **Deploy a functioning app to a Cloud service** | Client-side development | Student failed to deploy an application to a predefined Cloud service. The application can’t be accessed through the publicly available URL and/or the error message is shown. | Student deployed an application to a Cloud service but some of the application features not working. Some parts of the application UI can be accessed through the publicly available URL however some functionalities are not available or result in an error message being shown. | Student deployed the application to a Cloud service, with the app being fully operational. Some parts of the application UI can be accessed through the publicly available URL however some functionalities are not fully operational or have minor bugs. | Student successfully deployed the application to a Cloud service, with the app being fully operational. All parts of the application UI are accessible through the publicly available URL. The deployed application is fully operational and new deployments don’t cause interruptions. |
| **Save and track changes in the source code using Git and GitHub** | Version Control | Student did not create a repository for an app or has less than one commit per day. | Student created a repository for the app and is making at least one commit per day. However, commits made have unclear and ambiguous messages and student has not used separate branches for development and deployment. | Student created a repository for the app and is making two or more commits per day. Student has used separate branches for development and deployment with clear and descriptive commit messages. | Student created a repository for the app and is making two or more commits per day. Student used atomic commits to clearly state every change made, with accurate and precise descriptions. Student used separate branches for development and deployment and additional branches for working on the features. |
| **Document the application’s features, configuration and technical specifications** | Career development | Student did not make any attempt to document the project’s specifications. | Student provided a partially completed project README. Student has only partially documented application’s features, configuration or specifications in the README file. | Student has created a well structured and clear README file that covers all of the application’s features, configuration and specifications. Student has included credits, clearly listing any collaborators, team members and resources used that contributed to the project. | Student has created a fully comprehensive and well structured README file that not only clearly communicates the application’s features, configuration and specifications but goes into further detail justifying the choice for inclusion in the application. Student has added a license to the file and included credits, clearly listing any collaborators, team members and resources used that contributed to the project as well as badges. |
| **Practice communication, critical thinking, professionalism and teamwork skills** | Career development | Student did not make time or effort to communicate with others during standups or other activities. Student depended on others (teammates or teaching staff) to do the heavy thinking and most of the work. Student did not make the effort to assist others or collaborate in any way. | Student communicated at times with others during standups but could be more clear and concise in their delivery. Student remained in their comfort zone by excluding themselves from conversations that would require teamwork skills and idea exchange during the development of the project. | Student demonstrated clear communication skills and attended all standups. Student adhered to a level of professionalism by acting emotionally mature and engaged in teamwork skills by listening to others’ ideas while contributing their own. | Student impressively demonstrated clear communication skills during standups and contributed to group discussions, going out of their way to help other students in the group. Student adhered to a level of professionalism by acting emotionally mature and engaged in teamwork skills by listening to others’ ideas while contributing their own. |
| **Build a presentation and perform a demo to deliver your final results or the results of your group** | Career development | Student did not present or demo their application or talk through their slides during the project presentations. | Student presented and demoed their work but struggled with the timing and the rhythm of the presentation. Student had to skip or rush through certain slides to keep up with the time. Student struggled to deliver a clear message, leaving the audience confused. | Student presented their work effectively. The presentation and demo appeared prepared and structured, conveying a clear message to the audience. Student used the allocated time effectively. | Student presented their work impressively. The presentation and demo appeared very well prepared and structured, conveying a clear message to the audience. Student used the allocated time effectively. Student’s tone and storytelling were well aligned with the subject of the project. Student kept the audience in awe for the duration of the presentation and demo. |
| **BONUS: Enhance the application solution with extra features (ex. 404 page)** | Client-side development | Student didn’t implement any extra features. | Student implemented some extra features that may be partially working or that it is shown that there has been an effort in the design and development of the solution. | Student implemented functional extra features that add value to the application. Extra features are properly tested and documented. | Student implemented fully functional extra features that add value to the application that goes beyond the scope of the project showing exceptional understanding of one or more concepts that were not covered in class (e.g. advanced animations, code re-usability). The extra features are properly tested and documented. |

---

## Good luck! ❤️
