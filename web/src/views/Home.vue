<template>

  <div class="container mt-5">
    <div class="card-columns " >
      <div class="card" v-for='(item, index) in products' :key='index'>
        <img class="card-img-top" alt="Card image cap" :src="getImageUrl(item.image)">
        <div class="card-body">
          <h5 class="card-title"> <a class="product-name" v-bind:href="'/detail/' + item.id">{{ item.name }}</a></h5>
          <h4 style="font-family: cursive;">{{ item.money }} {{ item.price }}  {{ item.moneySymbol }}</h4>
          <p class="card-text">{{ item.description }} </p>
        </div>
        <div class="card-footer">
          <small class="text-muted"><span v-if="item.freeDelivery"> FREE </span>Delivery: <span
              class="value">{{ item.deliveryIn }}</span></small>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import {getAllProducts} from "@/common/product.service";
import {BASE_URL} from "@/common/config";

export default {
  name: "home",

  data() {
    return {
      products: []
    }
  },
  created() {
    this.getProducts();
  },
  methods: {
    getProducts() {
      getAllProducts().then(response => {
        this.products = response.data;
      })
    },
    getImageUrl(id) {
      return BASE_URL + 'filestore/' + id;
    }
  }
}
</script>


