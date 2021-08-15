<template>

  <nav class="navbar navbar-expand-lg navbar-light bg-light container">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <span class="nav-link"> <router-link to="/">Home</router-link></span>
        </li>
        <li class="nav-item">
          <span class="nav-link"><router-link to="/about">About</router-link></span>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#">Disabled</a>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </nav>
  <div class="container aqua-background mb-4">
    <div class="btn-group" role="group" aria-label="Basic example">
      <a class="product-name btn btn-secondary m-1" v-for="category in categories" :key="category"
         v-bind:href="'/category/' + category.id">
        {{ category.name }}
      </a>
    </div>
  </div>

  <router-view/>

</template>

<script>
import {getCategories} from "@/common/product.service";
import {BASE_URL} from "@/common/config";

export default {
  name: 'home',
  data() {
    return {categories: {}}
  },
  created() {
    this.getCategories();
  },

  methods: {
    getCategories() {
      getCategories().then(response => {
        this.categories = response.data;
      });
    }

  }

}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>