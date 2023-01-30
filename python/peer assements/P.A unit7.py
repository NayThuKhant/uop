def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d
def has_duplicates(s):
    h = histogram(s)
    for c in h.values():
        if c > 1:
            return True
    return False
print(has_duplicates("aahlam"))


def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d
def has_duplicates(s):
    h = histogram(s)
    for c in h.values():
        if c > 1:
            return True
    return False
print(has_duplicates("ahlm"))

 

alphabet = "abcdefghijklmnopqrstuvwxyz"   

test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"] 

test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"] 

def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d
    
def has_duplicates(s):
    h = histogram(s)
    for c in h.values():
        if c > 1:
            return True
    return False

for dups in test_dups:
    if has_duplicates(dups):
        print(dups, "has duplicates")
    else:
         print(dups, "has no duplicates")

def missing_letters(s):
    h = histogram(s)
    let_list = []
    for c in alphabet:
        if c not in h:
            let_list.append(c)
    return "".join(let_list)

for n in test_miss:
    if len(missing_letters(n)):
        print(n, "is missing letters", missing_letters(n))
    else:
        print(n, "uses all letters")
