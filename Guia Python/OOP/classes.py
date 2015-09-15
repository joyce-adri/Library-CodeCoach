__author__ = 'Ch'

#An example of a class
class Customer(object):
    """A customer of ABC Bank with a checking account. Customers have the
    following properties:

    Attributes:
        name: A string representing the customer's name.
        balance: A float tracking the current balance of the customer's account.
    """

    def __init__(self, name):
        """Return a Customer object whose name is *name* and starting
        balance is 0."""
        self.name = name
        self.balance = 0.0

    def set_balance(self, balance=0.0):
        """Set the customer's starting balance."""
        self.balance = balance

    def withdraw(self, amount):
        """Return the balance remaining after withdrawing *amount*
        dollars."""
        if amount > self.balance:
            raise RuntimeError('Amount greater than available balance.')
        self.balance -= amount
        return self.balance

    def deposit(self, amount):
        """Return the balance remaining after depositing *amount*
        dollars."""
        self.balance += amount
        return self.balance






class Song(object):

    def __init__(self, lyrics):
        self.lyrics = lyrics

    def sing_me_a_song(self):
        for line in self.lyrics:
            print line
    """
    happy_bday = Song(["Happy birthday to you",
                       "I don't want to get sued",
                       "So I'll stop right there"])

    bulls_on_parade = Song(["They rally around tha family",
                            "With pockets full of shells"])

    happy_bday.sing_me_a_song()

    bulls_on_parade.sing_me_a_song()
    """