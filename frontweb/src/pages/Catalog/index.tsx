import ProductCard from 'components/ProductCard';
import { Product } from 'types/product';

const product: Product = {
  id: 2,
  name: 'Smart TV',
  description:
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitatio',
  price: 2190.0,
  imgUrl:
    'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/2-big.jpg',
  date: '2020-07-14T10:00:00Z',
  categories: [
    {
      id: 1,
      name: 'Livros',
    },
    {
      id: 3,
      name: 'Computadores',
    },
  ],
};
const Catalog = () => {
  return (
    <div className="container my-4">
      <div className="row">
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProductCard product={product} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProductCard product={product} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProductCard product={product} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProductCard product={product} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProductCard product={product} />
        </div>
      </div>
    </div>
  );
};

export default Catalog;
