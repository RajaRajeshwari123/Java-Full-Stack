import React, { useState } from "react";
import UserService from "../services/user.service";
// import "./Addproduct.css"; // Import your CSS file if needed

const Addproduct = () => {
  const [name, setName] = useState('');
  const [addedProduct, setAddedProduct] = useState(null);
  const [error, setError] = useState(null);

  const handleSubmit = async (e) => {
      e.preventDefault();

      const payload = {
          id: 0,
          name: name,
          features: null
      };

      try {
          const response = await UserService.getAdminBoard(payload);
          setAddedProduct(response.data); 
          setError(null);
      } catch (error) {
          console.error('Error adding product:', error);
          setError('Error adding product');
      }
  };

  return (
      <div className="container mt-5">
          <div className="card">
              <div className="card-header">
                  <h3 className="mb-0">Add Product</h3>
              </div>
              <div className="card-body">
                  <form onSubmit={handleSubmit}>
                      <div className="mb-3">
                          <label htmlFor="name" className="form-label">Product Name:</label>
                          <input type="text" id="name" className="form-control" value={name} onChange={(e) => setName(e.target.value)} required />
                      </div>
                      <button type="submit" className="btn btn-primary">Add Product</button>
                  </form>
                  {addedProduct && (
                      <div className="mt-4">
                          <h3>Product added successfully:</h3>
                          <p>Name: {addedProduct.name}</p>
                      </div>
                  )}
                  {error && <p className="mt-4 text-danger">Error: {error}</p>}
              </div>
          </div>
      </div>
  );
};

export default Addproduct;
