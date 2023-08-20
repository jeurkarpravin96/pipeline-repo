step 1: Create a webhook i.e.( webhhok created for every repo separetely) of repo which is going to used for jenkins pipeline.
step 2: While creating webhoook, we need to add webhook url i.e. jenkins host url/github-webhook/ ex. http://localhost:8080/github-webhook
step 3: jenkins URL should be expose to publically if not then follows step 4 to make it publically available
step 4: To make localhost i.e. local ip publically expose,we have to install ngrok i.e. https://ngrok.com/download follows the step mentioned on site. 
also need to verify the email which is used to registered with ngrok
step 5: Do the changes in project and push it to test webhook
step 6: we also need to install deploy to container pugin to host application on tomcat
