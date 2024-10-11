# Navigate to your folder
cd path/to/your/folder

# Initialize Git (if needed)
git init

# Add remote repository (if needed)
git remote add origin https://github.com/YourUsername/YourRepo.git

# Stage all files
git add .

# Commit the changes
git commit -m "Added folder with contents"

# (Optional) Pull from the remote repository
git pull origin main

# Push the changes to the remote repository
git push origin main

# (Optional) Force push if conflicts arise
git push origin main --force
