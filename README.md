

# Quickstart

-   Make sure lein and a jvm are installed
-   run \`\`lein sass watch'' to compile css whenever updated
-   run leinfigwheel to start the server
-   by default it will be available on localhost:3449


# Recomended


## Emacs

Emacs can make working in clojure and lisp languages much more
pleasent, however any editor will work with figwheel, since it is
triggered by file changes.


### Packages

If you have not already added melpa-stable to your package archive add
the following to your .emacs

    (load-library "package")
    (add-to-list 'package-archives
                 '("melpa-stable" . "http://stable.melpa.org/packages/") t)
    (package-initialize)

-   **cider:** Allows you to connect to a clojure session
-   **paredit:** Structural editing made easy
-   **highlight-parentheses:** Help visualize structure
-   **clojure-mode:** Self explanatory


### Suggested hook if above packages are installed

    (dolist (hook '(eldoc-mode
                    paredit-mode prettify-symbols-mode
                    highlight-parentheses-mode aggressive-indent-mode))
      (add-hook clojure-mode-hook))

