import {get} from "@/common/api.service";


export function getProductDetailById(id) {
    return get('products/' + id);
}

export function getAllByCategoryId(id) {
    return get('category/'+ id);
}

export function getCategories(){
    return get('category')
}