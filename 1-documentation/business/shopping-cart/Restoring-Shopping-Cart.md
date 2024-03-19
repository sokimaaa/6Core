# Restoring Shopping Cart Flow

## Case 1 - Happy Path Restoring Shopping Cart
The customer may accidentally fully clean up the shopping cart.

Need to provide ability to restore previous version of shopping cart. 
No need to have deep history of shopping cart, enough to have previous state only.

After receiving customer request to restore shopping cart the service should fully update 
the shopping cart items to previous version. 