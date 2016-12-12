# Program Languages

----
### Topics


[Covariance](#covariance)  
[Contravariance](#contravariance)  
[foldRight](#foldRight)

---

## <a name="covariance"></a>Covariance
```scala
class One {
    var name = "Fred"
    def f: Animal
}

class Two extends class One {
    override var name = "Steve"
    def f: Animal
}
```
- Is-a relationship
- Class Two is child class of Class One
- Same public methods and fields


----
## <a name="contravariance"></a>Contravariance
Parameter and output variance

```scala
class One {
    def f(x: Dog): Animal
}

class Two extends class One {
    def f(x: Animal): Dog
}
```

Class Two needs to have a higher or equal parameter with an equal or lower result

----
#CS481 #WestPoint #CompSci
