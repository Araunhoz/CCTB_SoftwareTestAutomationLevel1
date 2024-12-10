Created by: Paulo Henrique A. Munhoz

task1

The Head section we have the types of Heading 1,2,3,4 and 5. And
in the body we have the formatation.

Task 2

In this part was created the class menu and your sections: Home, About, Services and Contact

     <ul class="menu">
            <li class="menu-item active">Home</li>
            <li class="menu-item">About</li>
            <li class="menu-item">Services</li>
            <li class="menu-item">Contact</li>

In the button, a little script to when the user to click, it will see the message and after
 3 seconds the message will disappear. I used javascript.

 <button class="submit-button" onclick="showMessage()">Submit</button>
    <div id="message" class="message"></div>

    <script>
        function showMessage() {
            const messageDiv = document.getElementById('message');
            messageDiv.innerText = "Button clicked!";
            setTimeout(() => {
                messageDiv.innerText = "";
            }, 3000);
        }
    </script>

In the css was created as the description of task. 

Task 3

Created a simple page with a link of google. The css was created as the description of task.

