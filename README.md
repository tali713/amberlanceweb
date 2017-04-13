

# Quickstart

-   Make sure lein and a JVM are installed
-   Run \`\`lein sass watch'' to compile css whenever updated
-   Run \`\`lein figwheel'' to start the server
-   By default it will be available on localhost:3449


# Recommended


## Emacs

Emacs can make working in Clojure and other lisp family languages
much more pleasant, however any editor will work with figwheel,
since it is triggered by file changes.


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
      (add-hook 'clojure-mode-hook hook))

