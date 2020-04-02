from django.shortcuts import render
from django.http import HttpResponse,JsonResponse
from api.models import Company,Vacancy

# Create your views here.
def companies_list(request):
    companies=Company.objects.all()
    json_companies= [company.to_json() for company in companies]
    return JsonResponse(json_companies,safe=False)

def companies_detail(request,company_id):
    try:
        company=Company.objects.get(id=company_id)
    except Company.DoesNotExist as e:
            return JsonResponse({'error':str(e)})
    return JsonResponse(company.to_json())


def company_vacancies(request,company_id):
    try:
        company=Company.objects.get(id=company_id)
    except Company.DoesNotExist as e:
            return JsonResponse({'error':str(e)})
    vacancies=company.vacancy_set.all()
    vacancies_json=[vacancy.to_json() for vacancy in vacancies]
    return JsonResponse(vacancies_json,safe=False)


#to get values of vacancies we have to call all function
#company.vacancy_set return related manager
#to connect company and vacancy we use foreign key
#it means it automatically adds to company related name
#Company.vacancies_set.all()-return all vacancies of this company


def vacancies_list(request):
    vacancies=Vacancy.objects.all()
    json_vacancies= [vacancy.to_json() for vacancy in vacancies]
    return JsonResponse(json_vacancies,safe=False)


def vacancies_detail(request,vacancy_id):
    try:
        vacancy=Vacancy.objects.get(id=vacancy_id)
    except Vacancy.DoesNotExist as e:
        return JsonResponse({'error':str(e)})
    return JsonResponse(vacancy.to_json())

def topvacancies(request):
    vacancies=Vacancy.objects.order_by("-salary").filter(id__lte=10)
    json_vacancies=[vacancy.to_json() for vacancy in vacancies]
    return JsonResponse(json_vacancies,safe=False)