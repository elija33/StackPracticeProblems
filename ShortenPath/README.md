# StackPracticeProblems

                                                                    Shorten Path
                                                                    
Write a function that takes in a non-empty string representing a valid Unix-shell path and returns a shortened version of that path.

A path is a notation that represents the location of a file or directory in a file system.

A path can be an absolute path, meaning that it starts at the root directory in a file system, or a relative path, meaning that it starts at the current directory in a file system.

In a Unix - like operating system, a path is bound by the following rules:
    - The root directory is represented by a /. This means that if a path starts with /. it's an absolute path; if it doesn't, it's a relative path.
    - The symbol / otherwise represents the directory separator, This means that the path /foo/bar is the location of the directory bar inside the directory foo. which is itself located inside the root diretory.
    - The symbol .. represents the parent directory. This means that accessing file or directories in /foo/bar/.. is equivalent to accessing files or directories in /foo.
    - The symbol . represents the current directory. This means that accessing file or directories in /foo/bar/. is equivalent to accessing files or directories in /foo/bar.
    - The symbol / and . can be repeated sequentially without consequence; the symbol .. can not, however, because repeating it sequentially means going further up in parent directories. for example, /foo/bar/baz/././. and /foo/bar/baz are equivalent paths, but /foo/bar/baz/../../../ and /foo/bar/baz are equivalent, because the root directory hs no parent directory, which means that repeatedly accessing parent directories does nothing.

Note that the shortened version of the path must be equivalent to the original path. In other words, it must point to the same file or directory as the original path.